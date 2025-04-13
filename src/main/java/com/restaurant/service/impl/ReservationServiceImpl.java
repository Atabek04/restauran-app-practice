package com.restaurant.service.impl;

import com.restaurant.dto.ReservationResponse;
import com.restaurant.model.Reservation;
import com.restaurant.repository.ReservationRepository;
import com.restaurant.service.ReservationService;
lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public List<ReservationResponse> getUserReservations() {
        // Implement logic to get user reservations
    }

    @Override
    public void deleteReservation(String id) {
        // Implement logic to delete reservation
    }
}
