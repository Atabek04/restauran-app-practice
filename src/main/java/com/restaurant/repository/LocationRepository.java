package com.restaurant.repository;

import com.restaurant.models.Location;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends DynamoDBCrudRepository<Location, Long> {
}