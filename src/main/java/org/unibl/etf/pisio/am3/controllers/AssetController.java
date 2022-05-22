package org.unibl.etf.pisio.am3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.am3.exceptions.NotFoundException;
import org.unibl.etf.pisio.am3.models.Asset;
import org.unibl.etf.pisio.am3.services.AssetService;

import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetController {
    private final AssetService assetService;

    public AssetController( AssetService assetService) {

        this.assetService = assetService;
    }

    @GetMapping
    List<Asset> findAll(){
        return assetService.findAll();
    }

    @GetMapping("/{id}")
    public Asset findById(@PathVariable Integer id) throws NotFoundException {
        return assetService.findById(id);
    }
}