package com.restaurant.repository;

import com.restaurant.model.ERole;
import com.restaurant.model.UserRole;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

import java.util.Optional;

@EnableScan
public interface RoleRepository extends DynamoDBCrudRepository<UserRole, Integer> {
    Optional<UserRole> findByName(ERole name);
}