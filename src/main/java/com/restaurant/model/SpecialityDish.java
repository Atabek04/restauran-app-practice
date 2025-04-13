package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamoDBTable(tableName = "speciality_dishes")
public class SpecialityDish {

    @DynamoDBHashKey
    private String dishId;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private String locationId;

    @DynamoDBAttribute
    private double price;

    @DynamoDBAttribute
    private String weight;

    @DynamoDBAttribute
    private String imageUrl;
}