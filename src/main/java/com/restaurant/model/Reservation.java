package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Reservations")
public class Reservation {

    @DynamoDBHashKey
    private String reservationId;

    @DynamoDBIndexRangeKey(globalSecondaryIndexName = "locationId_tableNumber-date-index")
    @DynamoDBIndexHashKey(globalSecondaryIndexName = "date-index")
    private String date;

    @DynamoDBAttribute
    private String feedbackId;

    @DynamoDBAttribute
    private int guestsNumber;

    @DynamoDBAttribute
    private String locationId;

    @DynamoDBAttribute
    private String locationAddress;

    @DynamoDBAttribute
    private String preOrder;

    @DynamoDBAttribute
    private String status;

    @DynamoDBAttribute
    private int tableNumber;

    @DynamoDBAttribute
    private String timeSlot;

    @DynamoDBAttribute
    private String userInfo;

    @DynamoDBAttribute
    private String userFullName;

    @DynamoDBAttribute
    private String waiterId;

    @DynamoDBAttribute
    private String waiterFullName;

    @DynamoDBIndexHashKey(globalSecondaryIndexName = "locationId_tableNumber-date-index")
    private String locationId_tableNumber;
}