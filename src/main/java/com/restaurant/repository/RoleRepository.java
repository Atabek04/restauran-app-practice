package com.restaurant.repository;

import com.restaurant.model.ERole;
import com.restaurant.model.Role;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

import java.util.Optional;

@EnableScan
public interface RoleRepository extends DynamoDBCrudRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}