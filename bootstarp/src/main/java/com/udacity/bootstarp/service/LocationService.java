package com.udacity.bootstarp.service;

import com.udacity.bootstarp.entity.Location;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LocationService {
    List<Location> retrieveLocations();
}
