package com.restaurant.repository;

import com.restaurant.model.WaiterTimeSlot;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

public interface WaiterTimeSlotRepository extends DynamoDBCrudRepository<WaiterTimeSlot, String> {
}