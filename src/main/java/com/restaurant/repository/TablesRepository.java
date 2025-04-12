package com.restaurant.repository;

import com.restaurant.model.Tables;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface TablesRepository extends CrudRepository<Tables, String> {
}
