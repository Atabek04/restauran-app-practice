package com.restaurant.repository;

import com.restaurant.model.SpecialityDish;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface SpecialityDishRepository extends CrudRepository<SpecialityDish, String> {
}
