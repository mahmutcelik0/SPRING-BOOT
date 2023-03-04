package com.mahmutcelik.demo1.controller;

import com.mahmutcelik.demo1.exception.LocationNotFoundException;
import com.mahmutcelik.demo1.model.Location;
import com.mahmutcelik.demo1.service.location.LocationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LocationController {
    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/location")
    private List<Location> getAllUsers() throws LocationNotFoundException {
        return locationService.getAllUsers();
    }

    @GetMapping("/location/{id}")
    private Location getLocationById(@PathVariable Long id) throws LocationNotFoundException {
        return locationService.getLocationById(id);
    }
}
