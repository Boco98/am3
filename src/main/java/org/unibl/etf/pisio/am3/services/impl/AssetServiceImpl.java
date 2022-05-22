package org.unibl.etf.pisio.am3.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.pisio.am3.exceptions.NotFoundException;
import org.unibl.etf.pisio.am3.models.Asset;
import org.unibl.etf.pisio.am3.repositories.AssetEntityRepository;
import org.unibl.etf.pisio.am3.services.AssetService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssetServiceImpl implements AssetService {


    private final ModelMapper modelMapper;

    private final AssetEntityRepository assetEntityRepository;

    public AssetServiceImpl(ModelMapper modelMapper, AssetEntityRepository assetEntityRepository) {
        this.modelMapper = modelMapper;
        this.assetEntityRepository= assetEntityRepository;
    }


    @Override
    public List<Asset> findAll() {
        return assetEntityRepository.findAll().stream().map(a->modelMapper.map(a, Asset.class)).collect(Collectors.toList());
    }

    @Override
    public Asset findById(Integer id) throws NotFoundException {
        return modelMapper.map(assetEntityRepository.findById(id).orElseThrow(NotFoundException::new),Asset.class);
    }
}
