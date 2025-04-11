package com.restaurant.dto;

import java.time.LocalDateTime;

public class ReservationResponse {

    private Long id;
    private String tableId;
    private String customerId;
    private LocalDateTime reservationTime;

    public ReservationResponse(Long id, String tableId, String customerId, LocalDateTime reservationTime) {
        this.id = id;
        this.tableId = tableId;
        this.customerId = customerId;
        this.reservationTime = reservationTime;
    }

    // Getters and Setters
}
