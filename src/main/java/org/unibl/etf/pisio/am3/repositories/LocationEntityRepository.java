package org.unibl.etf.pisio.am3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unibl.etf.pisio.am3.models.entities.LocationEntity;

public interface LocationEntityRepository extends JpaRepository<LocationEntity, Integer> {
}
