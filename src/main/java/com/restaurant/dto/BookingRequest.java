package com.restaurant.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class BookingRequest {

    @NotBlank
    private String tableId;

    @NotBlank
    private String customerId;

    @NotNull
    private LocalDateTime bookingTime;

    // Getters and Setters
}
