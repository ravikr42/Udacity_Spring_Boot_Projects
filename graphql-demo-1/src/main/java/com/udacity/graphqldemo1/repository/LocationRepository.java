package com.udacity.graphqldemo1.repository;


import com.udacity.graphqldemo1.entitty.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}