package com.restaurant.model;

import com.github.derjust.spring_data_dynamodb.annotation.DynamoDBHashKey;
import com.github.derjust.spring_data_dynamodb.annotation.DynamoDBTable;
import com.github.derjust.spring_data_dynamodb.annotation.DynamoDBTypeConvertedEnum;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "roles")
public class Role {

    @Id
    @DynamoDBHashKey
    private String id;

    @DynamoDBTypeConvertedEnum
    private ERole name;

}