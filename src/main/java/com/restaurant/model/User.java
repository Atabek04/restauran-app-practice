package com.restaurant.model;

import org.socialsignin.spring.data.dynamodb.mapping.DynamoDBHashKey;
import org.socialsignin.spring.data.dynamodb.mapping.DynamoDBTable;
import org.socialsignin.spring.data.dynamodb.mapping.DynamoDBAttribute;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "Users")
public class User {

    @DynamoDBHashKey
    private String id;

    @DynamoDBAttribute(attributeName = "username")
    private String username;

    @DynamoDBAttribute(attributeName = "email")
    private String email;

    @DynamoDBAttribute(attributeName = "password")
    private String password;

    @DynamoDBAttribute(attributeName = "roles")
    private Set<Role> roles;
}