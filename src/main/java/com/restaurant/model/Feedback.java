package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Feedbacks")
public class Feedback {
    @DynamoDBHashKey
    private String feedbackId;
    private String comment;
    private String date;
    private String locationAddress;
    private String locationId;
    private int rate;
    private String reservationId;
    private String type;
    private String userName;
    private String waiterId;
    private String waiterName;
}