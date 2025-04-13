package com.restaurant.repository;

import com.restaurant.model.Reservation;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;

public interface ReservationRepository extends DynamoDBCrudRepository<Reservation, String> {
}