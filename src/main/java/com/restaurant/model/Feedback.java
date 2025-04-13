package com.restaurant.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Feedbacks")
public class Feedback {
    @DynamoDBHashKey
    private String feedbackId;

    @DynamoDBAttribute
    private String comment;

    @DynamoDBAttribute
    private String date;

    @DynamoDBAttribute
    private String locationId;

    @DynamoDBAttribute
    private int rate;

    @DynamoDBAttribute
    @DynamoDBTypeConvertedEnum
    private FeedbackType type;

    @DynamoDBAttribute
    private String userName;

    @DynamoDBAttribute
    private String userAvatarUrl;
}