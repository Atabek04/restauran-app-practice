package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Reservations")
public class Reservation {

    @DynamoDBHashKey(attributeName = "reservationId")
    private String reservationId;

    @DynamoDBAttribute
    private String date;

    @DynamoDBAttribute
    private int guestsNumber;

    @DynamoDBAttribute
    private String locationAddress;

    @DynamoDBAttribute
    private String locationId;

    @DynamoDBAttribute
    private String locationId_tableNumber;

    @DynamoDBAttribute
    private String status;

    @DynamoDBAttribute
    private int tableNumber;

    @DynamoDBAttribute
    private String timeSlot;

    @DynamoDBAttribute
    private String userInfo;
}
