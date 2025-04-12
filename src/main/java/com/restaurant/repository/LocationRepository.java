package com.restaurant.repository;

import com.restaurant.model.Location;
import com.github.derjust.spring_data_dynamodb.repository.EnableScan;
import com.github.derjust.spring_data_dynamodb.repository.DynamoDBCrudRepository;

@EnableScan
public interface LocationRepository extends DynamoDBCrudRepository<Location, Long> {
}