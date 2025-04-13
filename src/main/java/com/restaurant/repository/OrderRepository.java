package com.restaurant.repository;

import com.restaurant.model.Order;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

public interface OrderRepository extends DynamoDBCrudRepository<Order, String> {
}