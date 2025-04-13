package com.restaurant.repository;

import com.restaurant.model.Dish;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

public interface DishRepository extends DynamoDBCrudRepository<Dish, String> {
}