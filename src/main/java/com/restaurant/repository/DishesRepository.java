package com.restaurant.repository;

import com.restaurant.model.Dishes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface DishesRepository extends CrudRepository<Dishes, String> {
}
