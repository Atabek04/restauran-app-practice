package com.restaurant.model;

import org.socialsignin.spring.data.dynamodb.mapping.DynamoDBHashKey;
import org.socialsignin.spring.data.dynamodb.mapping.DynamoDBTable;

import java.time.LocalDateTime;

@DynamoDBTable(tableName = "reservations")
public class Reservation {

    @DynamoDBHashKey
    private Long id;

    private String tableId;

    private String customerId;

    private LocalDateTime reservationTime;

    // Getters and Setters
}