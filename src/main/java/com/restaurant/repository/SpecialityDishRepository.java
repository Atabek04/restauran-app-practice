package com.restaurant.repository;

import com.restaurant.model.SpecialityDish;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

@EnableScan
public interface SpecialityDishRepository extends DynamoDBCrudRepository<SpecialityDish, String> {
}