package com.restaurant.model;

import org.socialsignin.spring.data.dynamodb.mapping.DynamoDBHashKey;
import org.socialsignin.spring.data.dynamodb.mapping.DynamoDBTable;

import java.util.HashSet;
import java.util.Set;

@DynamoDBTable(tableName = "users")
public class User {

    @DynamoDBHashKey
    private Long id;

    private String username;

    private String email;

    private String password;

    private Set<Role> roles = new HashSet<>();

    // Getters and Setters
}