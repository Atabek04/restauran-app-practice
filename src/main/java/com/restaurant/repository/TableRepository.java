package com.restaurant.repository;

import com.restaurant.model.Table;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

public interface TableRepository extends DynamoDBCrudRepository<Table, String> {
}