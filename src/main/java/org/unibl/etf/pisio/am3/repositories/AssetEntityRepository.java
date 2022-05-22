package org.unibl.etf.pisio.am3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.unibl.etf.pisio.am3.models.entities.AssetEntity;

import java.util.List;

public interface AssetEntityRepository extends JpaRepository<AssetEntity, Integer>{

    List<AssetEntity> getAllByLocation_Id(Integer id);

    @Query("SELECT a FROM AssetEntity a WHERE a.location.id=:id")
    List<AssetEntity> getByLocationId(Integer id);
}
