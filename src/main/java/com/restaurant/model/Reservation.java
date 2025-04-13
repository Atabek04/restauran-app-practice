package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Reservations")
public class Reservation {
    @DynamoDBHashKey
    private String reservationId;
    private String date;
    private int guestsNumber;
    private String locationAddress;
    private String locationId;
    private String locationId_tableNumber;
    private String status;
    private int tableNumber;
    private String timeSlot;
    private String userInfo;
}