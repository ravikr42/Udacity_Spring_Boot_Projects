package com.udacity.graphqldemo1.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.udacity.graphqldemo1.entitty.Location;
import com.udacity.graphqldemo1.repository.LocationRepository;

public class Query implements GraphQLResolver {
    private LocationRepository locationRepository;

    public Query(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Iterable<Location> finaAllLocations() {
        return locationRepository.findAll();
    }
}
