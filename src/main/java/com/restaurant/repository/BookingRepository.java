package com.restaurant.repository;

import com.restaurant.model.Booking;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface BookingRepository extends CrudRepository<Booking, Long> {
    List<Booking> findByTableId(String tableId);
}
