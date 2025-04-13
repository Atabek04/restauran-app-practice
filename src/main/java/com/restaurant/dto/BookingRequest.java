package com.restaurant.dto;

import lombok.Data;

@Data
public class BookingRequest {
    private String tableId;
    private String customerId;
    private String bookingTime;
}