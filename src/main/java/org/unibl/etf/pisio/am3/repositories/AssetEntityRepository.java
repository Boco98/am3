package org.unibl.etf.pisio.am3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.unibl.etf.pisio.am3.models.AssetNameType;
import org.unibl.etf.pisio.am3.models.entities.AssetEntity;

import java.util.List;

public interface AssetEntityRepository extends JpaRepository<AssetEntity, Integer>{

    List<AssetEntity> getAllByLocation_Id(Integer id);

    //select pa konstruktor punokvaliffikovanog naziva  nase dto klase
    @Query("SELECT new org.unibl.etf.pisio.am3.models.AssetNameType(a.name, a.assetType.name) FROM AssetEntity a")
    List<AssetNameType> getAllNameTypes();
}
