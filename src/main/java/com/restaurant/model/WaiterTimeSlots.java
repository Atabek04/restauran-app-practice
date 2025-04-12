package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@DynamoDBTable(tableName = "WaiterTimeSlots")
public class WaiterTimeSlots {

    @DynamoDBHashKey(attributeName = "waiterId")
    private String waiterId;

    @DynamoDBAttribute(attributeName = "dateTimeSlot")
    private String dateTimeSlot;
}
