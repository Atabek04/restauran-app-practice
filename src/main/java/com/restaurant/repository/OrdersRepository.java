package com.restaurant.repository;

import com.restaurant.model.Orders;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface OrdersRepository extends CrudRepository<Orders, String> {
}
