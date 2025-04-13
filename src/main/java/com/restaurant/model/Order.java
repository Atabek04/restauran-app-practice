package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

import java.util.List;

@Data
@DynamoDBTable(tableName = "Orders")
public class Order {
    @DynamoDBHashKey
    private String orderId;
    private String completionTime;
    private String creationTime;
    private String customerName;
    private List<Dish> dishes;
    private boolean isCompleted;
    private String locationAddress;
    private String locationId;
    private String reservationId;
    private String timeSlot;
    private double totalPrice;
    private String waiterId;
    private String waiterName;
}