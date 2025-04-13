package com.restaurant.service;

import com.restaurant.dto.ReservationResponse;

import java.util.List;

public interface ReservationService {
    List<ReservationResponse> getUserReservations(String userId);
    void deleteReservation(String reservationId);
}