package org.unibl.etf.pisio.am3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.am3.models.entities.LocationEntity;
import org.unibl.etf.pisio.am3.repositories.LocationEntityRepository;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {


    private final LocationEntityRepository repository;

    public LocationController(LocationEntityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<LocationEntity> findAll(){
        return repository.findAll();
    }
}
