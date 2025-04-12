package com.restaurant.model;

import org.socialsignin.spring.data.dynamodb.mapping.DynamoDBHashKey;
import org.socialsignin.spring.data.dynamodb.mapping.DynamoDBGeneratedUuid;
import org.socialsignin.spring.data.dynamodb.mapping.DynamoDBAttribute;
import org.socialsignin.spring.data.dynamodb.mapping.DynamoDBTable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamoDBTable(tableName = "speciality_dishes")
public class SpecialityDish {

    @DynamoDBHashKey
    @DynamoDBGeneratedUuid
    private String id;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private String description;

    @DynamoDBAttribute
    private Location location;
}