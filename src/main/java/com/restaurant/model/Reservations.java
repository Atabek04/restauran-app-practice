package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@DynamoDBTable(tableName = "Reservations")
public class Reservations {

    @DynamoDBHashKey(attributeName = "reservationId")
    private String reservationId;

    @DynamoDBAttribute(attributeName = "date")
    private String date;

    @DynamoDBAttribute(attributeName = "guestsNumber")
    private int guestsNumber;

    @DynamoDBAttribute(attributeName = "locationAddress")
    private String locationAddress;

    @DynamoDBAttribute(attributeName = "locationId")
    private String locationId;

    @DynamoDBAttribute(attributeName = "locationId_tableNumber")
    private String locationIdTableNumber;

    @DynamoDBAttribute(attributeName = "status")
    private String status;

    @DynamoDBAttribute(attributeName = "tableNumber")
    private int tableNumber;

    @DynamoDBAttribute(attributeName = "timeSlot")
    private String timeSlot;

    @DynamoDBAttribute(attributeName = "userInfo")
    private String userInfo;
}
