package com.restaurant.service;

import com.restaurant.dto.ReservationResponse;

import java.util.List;

public interface ReservationService {
    List<ReservationResponse> getUserReservations(String userId);
    List<ReservationResponse> getAllReservations();
    ReservationResponse getReservationById(Long id);
    void deleteReservation(String reservationId);
    void deleteReservation(Long id);
}