package com.restaurant.dto;

import lombok.Data;

@Data
public class ReservationResponse {
    private String id;
    private String userInfo;
    private String status;
    private String locationAddress;
    private String date;
    private String timeSlot;
    private String preOrder;
    private int guestsNumber;
    private int tableNumber;
    private String feedbackId;
}