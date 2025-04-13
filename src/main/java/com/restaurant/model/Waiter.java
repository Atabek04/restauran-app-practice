package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Waiters")
public class Waiter {
    @DynamoDBHashKey
    private String waiterId;
    private String email;
    private String firstName;
    private String imgUrl;
    private String lastName;
    private String locationId;
    private double rating;
}