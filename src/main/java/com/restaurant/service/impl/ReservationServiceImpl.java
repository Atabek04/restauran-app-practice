package com.restaurant.service.impl;

import com.restaurant.dto.ReservationResponse;
import com.restaurant.repository.ReservationRepository;
import com.restaurant.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public List<ReservationResponse> getUserReservations(String userId) {
        // Implement logic to get user reservations
        return null;
    }

    @Override
    public void deleteReservation(String reservationId) {
        // Implement logic to delete reservation
    }
}