package com.restaurant.dto;

import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class BookingRequest {

    @NotBlank
    private String tableId;

    @NotBlank
    private String customerId;

    @NotNull
    private LocalDateTime bookingTime;
    
}
