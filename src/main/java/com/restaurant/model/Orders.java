package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@DynamoDBTable(tableName = "Orders")
public class Orders {

    @DynamoDBHashKey(attributeName = "orderId")
    private String orderId;

    @DynamoDBAttribute(attributeName = "completionTime")
    private String completionTime;

    @DynamoDBAttribute(attributeName = "creationTime")
    private String creationTime;

    @DynamoDBAttribute(attributeName = "customerName")
    private String customerName;

    @DynamoDBAttribute(attributeName = "dishes")
    private List<Dish> dishes;

    @DynamoDBAttribute(attributeName = "isCompleted")
    private boolean isCompleted;

    @DynamoDBAttribute(attributeName = "locationAddress")
    private String locationAddress;

    @DynamoDBAttribute(attributeName = "locationId")
    private String locationId;

    @DynamoDBAttribute(attributeName = "reservationId")
    private String reservationId;

    @DynamoDBAttribute(attributeName = "timeSlot")
    private String timeSlot;

    @DynamoDBAttribute(attributeName = "totalPrice")
    private int totalPrice;

    @DynamoDBAttribute(attributeName = "waiterId")
    private String waiterId;

    @DynamoDBAttribute(attributeName = "waiterName")
    private String waiterName;

    @Data
    @Builder
    public static class Dish {
        @DynamoDBAttribute(attributeName = "dishId")
        private String dishId;

        @DynamoDBAttribute(attributeName = "dishName")
        private String dishName;

        @DynamoDBAttribute(attributeName = "imageUrl")
        private String imageUrl;

        @DynamoDBAttribute(attributeName = "ingredients")
        private String ingredients;

        @DynamoDBAttribute(attributeName = "price")
        private int price;

        @DynamoDBAttribute(attributeName = "quantity")
        private int quantity;
    }
}
