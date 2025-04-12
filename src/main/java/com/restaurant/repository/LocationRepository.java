package com.restaurant.repository;

import com.restaurant.model.Location;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;

@EnableScan
public interface LocationRepository extends DynamoDBCrudRepository<Location, Long> {
}