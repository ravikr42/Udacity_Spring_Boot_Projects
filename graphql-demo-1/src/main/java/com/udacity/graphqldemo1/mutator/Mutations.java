package com.udacity.graphqldemo1.mutator;

import com.udacity.graphqldemo1.entitty.Location;
import com.udacity.graphqldemo1.exception.LocationNotFoundException;
import com.udacity.graphqldemo1.repository.LocationRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutations {
    private LocationRepository locationRepository;

    public Mutations(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    public Location newLocation(String name, String address){
        Location location = new Location(name, address);
        locationRepository.save(location);
        return location;
    }

    public boolean deleteLocation(Long id){
        locationRepository.deleteById(id);
        return true;
    }

    public Location updateLocationName(String newName, Long id){
        Optional<Location> optionalLocation = locationRepository.findById(id);

        if(optionalLocation.isPresent()){
            Location location = optionalLocation.get();
            location.setName(newName);
            locationRepository.save(location);
            return location;
        }else{
            throw new LocationNotFoundException("Location Not Found", id);
        }
    }
}
