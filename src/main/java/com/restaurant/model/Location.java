package com.restaurant.model;

import com.github.derjust.spring_dynamodb.annotation.DynamoDBHashKey;
import com.github.derjust.spring_dynamodb.annotation.DynamoDBGeneratedUuid;
import com.github.derjust.spring_dynamodb.annotation.DynamoDBTable;
import com.github.derjust.spring_dynamodb.annotation.DynamoDBAttribute;
import lombok.Data;

import java.util.List;

@Data
@DynamoDBTable(tableName = "locations")
public class Location {

    @DynamoDBHashKey
    @DynamoDBGeneratedUuid
    private String id;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private String address;

    @DynamoDBAttribute
    private List<SpecialityDish> specialityDishes;

    @DynamoDBAttribute
    private List<Feedback> feedbacks;

}