package com.restaurant.dto;

import lombok.Data;

@Data
public class BookingResponse {
    private String tableId;
    private String customerId;
    private String bookingTime;
}