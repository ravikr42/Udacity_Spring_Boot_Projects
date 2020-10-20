package com.udacity.graphqldemo1.service;


import com.udacity.graphqldemo1.entitty.Location;

import java.util.List;

public interface LocationService {
    List<Location> retrieveLocations();
}
