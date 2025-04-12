package com.restaurant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ReservationResponse {

    private Long id;
    private String tableId;
    private String customerId;
    private LocalDateTime reservationTime;

}
