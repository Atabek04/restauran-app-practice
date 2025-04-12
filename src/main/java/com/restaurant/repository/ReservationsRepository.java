package com.restaurant.repository;

import com.restaurant.model.Reservations;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ReservationsRepository extends CrudRepository<Reservations, String> {
}
