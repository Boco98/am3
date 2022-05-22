package org.unibl.etf.pisio.am3.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.pisio.am3.exceptions.NotFoundException;
import org.unibl.etf.pisio.am3.models.Asset;
import org.unibl.etf.pisio.am3.models.AssetRequest;
import org.unibl.etf.pisio.am3.models.entities.AssetEntity;
import org.unibl.etf.pisio.am3.repositories.AssetEntityRepository;
import org.unibl.etf.pisio.am3.services.AssetService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional//nudi da sve metode u ovoj klasi budu transakcionalne
public class AssetServiceImpl implements AssetService {


    private final ModelMapper modelMapper;

    private final AssetEntityRepository assetEntityRepository;

    @PersistenceContext
    private EntityManager entityManager;
    public AssetServiceImpl(ModelMapper modelMapper, AssetEntityRepository assetEntityRepository) {
        this.modelMapper = modelMapper;
        this.assetEntityRepository = assetEntityRepository;
    }


    @Override
    public List<Asset> findAll() {
        return assetEntityRepository.findAll().stream().map(a -> modelMapper.map(a, Asset.class)).collect(Collectors.toList());
    }

    @Override
    public Asset findById(Integer id) throws NotFoundException {
        return modelMapper.map(assetEntityRepository.findById(id).orElseThrow(NotFoundException::new), Asset.class);
    }

    @Override
    public List<Asset> getAllAssetsByLocationId(Integer id) {
        return assetEntityRepository.getAllByLocation_Id(id).stream().map(a -> modelMapper.map(a, Asset.class)).collect(Collectors.toList());
        //NAPOMENA: ID LOKACIJE JE BITAN , A NE ID ASSETA
    }

    @Override
    public Asset insert(AssetRequest assetRequest) throws NotFoundException {
        AssetEntity assetEntity = modelMapper.map(assetRequest, AssetEntity.class);
        assetEntity.setId(null);
        assetEntity = assetEntityRepository.saveAndFlush(assetEntity); //update-uje objekat i cuva u bazu
        entityManager.refresh(assetEntity);
        return findById(assetEntity.getId());
    }

    @Override
    public Asset update(Integer id, AssetRequest assetRequest) throws NotFoundException {
        AssetEntity assetEntity = modelMapper.map(assetRequest, AssetEntity.class);
        assetEntity.setId(id);
        assetEntity = assetEntityRepository.saveAndFlush(assetEntity);
        entityManager.refresh(assetEntity);
        return findById(assetEntity.getId());
    }

    @Override
    public void delete(Integer id) {
        assetEntityRepository.deleteById(id);
    }
}
