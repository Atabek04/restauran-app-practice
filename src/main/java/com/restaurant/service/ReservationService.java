package com.restaurant.service;

import com.restaurant.dto.ReservationResponse;

import java.util.List;

public interface ReservationService {
    List<ReservationResponse> getUserReservations();
    void deleteReservation(String id);
}
