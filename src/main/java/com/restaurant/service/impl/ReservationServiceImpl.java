package com.restaurant.service.impl;

import com.restaurant.dto.ReservationResponse;
import com.restaurant.model.Reservation;
import com.restaurant.repository.ReservationRepository;
import com.restaurant.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public List<ReservationResponse> getAllReservations() {
        return reservationRepository.findAll().stream()
                .map(reservation -> new ReservationResponse(reservation.getId(), reservation.getTableId(), reservation.getCustomerId(), reservation.getReservationTime()))
                .collect(Collectors.toList());
    }

    @Override
    public ReservationResponse getReservationById(Long id) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));
        return new ReservationResponse(reservation.getId(), reservation.getTableId(), reservation.getCustomerId(), reservation.getReservationTime());
    }

    @Override
    public List<ReservationResponse> getUserReservations(String userId) {
        return reservationRepository.findByCustomerId(userId).stream()
                .map(reservation -> new ReservationResponse(reservation.getId(), reservation.getTableId(), reservation.getCustomerId(), reservation.getReservationTime()))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public void deleteReservation(String reservationId) {
        reservationRepository.deleteById(Long.parseLong(reservationId));
    }
}