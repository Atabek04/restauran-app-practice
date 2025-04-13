package com.restaurant.repository;

import com.restaurant.model.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

import java.util.Optional;

@EnableScan
public interface UserRepository extends DynamoDBCrudRepository<User, String> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}