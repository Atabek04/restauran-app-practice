package com.restaurant.repository;

import com.restaurant.model.Reservation;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
