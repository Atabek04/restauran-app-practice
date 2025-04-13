package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Dishes")
public class Dish {
    @DynamoDBHashKey
    private String dishId;
    private int calories;
    private String carbohydrates;
    private String category;
    private String description;
    private String fats;
    private String imageUrl;
    private String ingredients;
    private boolean isOnStop;
    private String name;
    private int orderCounter;
    private double price;
    private String protein;
    private String vitaminsMinerals;
    private String weight;
}