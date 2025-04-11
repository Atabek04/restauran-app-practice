package com.restaurant.dto;

import java.time.LocalDateTime;

public class BookingResponse {

    private Long id;
    private String tableId;
    private String customerId;
    private LocalDateTime bookingTime;

    public BookingResponse(Long id, String tableId, String customerId, LocalDateTime bookingTime) {
        this.id = id;
        this.tableId = tableId;
        this.customerId = customerId;
        this.bookingTime = bookingTime;
    }

    // Getters and Setters
}
