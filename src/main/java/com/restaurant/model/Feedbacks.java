package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@DynamoDBTable(tableName = "Feedbacks")
public class Feedbacks {

    @DynamoDBHashKey(attributeName = "feedbackId")
    private String feedbackId;

    @DynamoDBAttribute(attributeName = "comment")
    private String comment;

    @DynamoDBAttribute(attributeName = "date")
    private String date;

    @DynamoDBAttribute(attributeName = "locationAddress")
    private String locationAddress;

    @DynamoDBAttribute(attributeName = "locationId")
    private String locationId;

    @DynamoDBAttribute(attributeName = "rate")
    private int rate;

    @DynamoDBAttribute(attributeName = "reservationId")
    private String reservationId;

    @DynamoDBAttribute(attributeName = "type")
    private String type;

    @DynamoDBAttribute(attributeName = "userName")
    private String userName;

    @DynamoDBAttribute(attributeName = "waiterId")
    private String waiterId;

    @DynamoDBAttribute(attributeName = "waiterName")
    private String waiterName;
}
