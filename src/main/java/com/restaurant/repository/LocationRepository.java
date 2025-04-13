package com.restaurant.repository;

import com.restaurant.model.Location;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

public interface LocationRepository extends DynamoDBCrudRepository<Location, String> {
}