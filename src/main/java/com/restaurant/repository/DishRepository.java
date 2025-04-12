package com.restaurant.repository;

import com.restaurant.model.Dish;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface DishRepository extends CrudRepository<Dish, String> {
}
