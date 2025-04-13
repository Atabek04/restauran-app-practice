package com.restaurant.repository;

import com.restaurant.model.AppUser;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

import java.util.Optional;

@EnableScan
public interface UserRepository extends DynamoDBCrudRepository<AppUser, Long> {

    Optional<AppUser> findByEmail(String email);

    boolean existsByEmail(String email);
}