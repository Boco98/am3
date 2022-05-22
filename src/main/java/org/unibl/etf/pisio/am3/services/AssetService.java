package org.unibl.etf.pisio.am3.services;

import org.unibl.etf.pisio.am3.exceptions.NotFoundException;
import org.unibl.etf.pisio.am3.models.Asset;

import java.util.List;

public interface AssetService {

    List<Asset> findAll();
    Asset findById(Integer id) throws NotFoundException;
}
