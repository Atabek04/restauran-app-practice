package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Feedbacks")
public class Feedback {

    @DynamoDBHashKey(attributeName = "feedbackId")
    private String feedbackId;

    @DynamoDBAttribute
    private String comment;

    @DynamoDBAttribute
    private String date;

    @DynamoDBAttribute
    private String locationAddress;

    @DynamoDBAttribute
    private String locationId;

    @DynamoDBAttribute
    private int rate;

    @DynamoDBAttribute
    private String reservationId;

    @DynamoDBAttribute
    private String type;

    @DynamoDBAttribute
    private String userName;

    @DynamoDBAttribute
    private String waiterId;

    @DynamoDBAttribute
    private String waiterName;
}
