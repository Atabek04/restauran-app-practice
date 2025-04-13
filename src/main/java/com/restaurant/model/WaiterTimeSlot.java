package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "WaiterTimeSlots")
public class WaiterTimeSlot {
    @DynamoDBHashKey
    private String waiterId;
    private String dateTimeSlot;
}