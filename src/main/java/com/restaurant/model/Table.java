package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@DynamoDBTable(tableName = "Tables")
public class Table {

    @DynamoDBHashKey(attributeName = "tableId")
    private String tableId;

    @DynamoDBAttribute(attributeName = "locationId")
    private String locationId;

    @DynamoDBAttribute(attributeName = "address")
    private String locationAddress;

    @DynamoDBAttribute(attributeName = "capacity")
    private int capacity;

    @DynamoDBAttribute(attributeName = "imageUrl")
    private String imageUrl;

    @DynamoDBAttribute(attributeName = "tableNumber")
    private int tableNumber;
}
