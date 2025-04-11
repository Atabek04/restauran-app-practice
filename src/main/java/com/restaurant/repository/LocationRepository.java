package com.restaurant.repository;

import com.restaurant.model.Location;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface LocationRepository extends CrudRepository<Location, Long> {
}
