package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "Waiters")
@Getter
@Setter
public class Waiter {

    @DynamoDBHashKey
    private String email;

    @DynamoDBAttribute
    private String waiterID;

    @DynamoDBAttribute
    private String firstName;

    @DynamoDBAttribute
    private String lastName;

    @DynamoDBAttribute
    private String imgUrl;

    @DynamoDBAttribute
    private String password;

    @DynamoDBIndexHashKey(globalSecondaryIndexName = "locationId-index")
    private String locationId;

    @DynamoDBAttribute
    private double rating;

    public String getFullName() {
        return firstName + " " + lastName;
    }
}