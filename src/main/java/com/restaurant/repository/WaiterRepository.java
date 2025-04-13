package com.restaurant.repository;

import com.restaurant.model.Waiter;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

public interface WaiterRepository extends DynamoDBCrudRepository<Waiter, String> {
}