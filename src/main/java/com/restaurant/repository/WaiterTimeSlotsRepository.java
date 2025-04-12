package com.restaurant.repository;

import com.restaurant.model.WaiterTimeSlots;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface WaiterTimeSlotsRepository extends CrudRepository<WaiterTimeSlots, String> {
}
