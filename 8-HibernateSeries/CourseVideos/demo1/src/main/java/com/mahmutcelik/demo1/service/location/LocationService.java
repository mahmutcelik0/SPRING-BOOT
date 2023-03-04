package com.mahmutcelik.demo1.service.location;

import com.mahmutcelik.demo1.exception.LocationNotFoundException;
import com.mahmutcelik.demo1.model.Location;

import java.util.List;

public interface LocationService {
    List<Location> getAllUsers() throws LocationNotFoundException;

    Location getLocationById(Long id) throws LocationNotFoundException;
}
