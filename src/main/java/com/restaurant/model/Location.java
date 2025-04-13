package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Locations")
public class Location {

    @DynamoDBHashKey
    private String locationId;

    @DynamoDBAttribute
    private String address;

    @DynamoDBAttribute
    private String description;

    @DynamoDBAttribute
    private int totalCapacity;

    @DynamoDBAttribute
    private int averageOccupancy;

    @DynamoDBAttribute
    private String imageUrl;

    @DynamoDBAttribute
    private double rating;

}