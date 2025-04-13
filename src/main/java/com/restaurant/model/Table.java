package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Tables")
public class Table {
    @DynamoDBHashKey
    private String tableId;
    private String address;
    private int capacity;
    private String imageUrl;
    private String locationId;
    private int tableNumber;
}