package org.unibl.etf.pisio.am3.services;

import org.unibl.etf.pisio.am3.exceptions.NotFoundException;
import org.unibl.etf.pisio.am3.models.Location;
import org.unibl.etf.pisio.am3.models.SingleLocation;

import java.util.List;


public interface LocationService {
    List<Location> findAll();
    SingleLocation findById(Integer id) throws NotFoundException;
}
