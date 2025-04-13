package com.restaurant.repository;

import com.restaurant.model.Reservation;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface BookingRepository extends DynamoDBCrudRepository<Reservation, Long> {
    List<Reservation> findByTableId(String tableId);
}