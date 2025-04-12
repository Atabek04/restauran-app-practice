package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@DynamoDBTable(tableName = "Dishes")
public class Dish {

    @DynamoDBHashKey(attributeName = "dishId")
    private String dishId;

    @DynamoDBAttribute(attributeName = "calories")
    private int calories;

    @DynamoDBAttribute(attributeName = "carbohydrates")
    private String carbohydrates;

    @DynamoDBAttribute(attributeName = "category")
    private String category;

    @DynamoDBAttribute(attributeName = "description")
    private String description;

    @DynamoDBAttribute(attributeName = "fats")
    private String fats;

    @DynamoDBAttribute(attributeName = "imageUrl")
    private String imageUrl;

    @DynamoDBAttribute(attributeName = "ingredients")
    private String ingredients;

    @DynamoDBAttribute(attributeName = "isOnStop")
    private boolean isOnStop;

    @DynamoDBAttribute(attributeName = "name")
    private String name;

    @DynamoDBAttribute(attributeName = "orderCounter")
    private int orderCounter;

    @DynamoDBAttribute(attributeName = "price")
    private int price;

    @DynamoDBAttribute(attributeName = "protein")
    private String protein;

    @DynamoDBAttribute(attributeName = "vitaminsMinerals")
    private String vitaminsMinerals;

    @DynamoDBAttribute(attributeName = "weight")
    private String weight;
}
