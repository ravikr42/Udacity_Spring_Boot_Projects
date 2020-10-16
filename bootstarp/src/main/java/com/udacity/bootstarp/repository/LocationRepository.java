package com.udacity.bootstarp.repository;

import com.udacity.bootstarp.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
