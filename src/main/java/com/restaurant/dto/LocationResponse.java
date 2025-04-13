package com.restaurant.dto;

import lombok.Data;

@Data
public class LocationResponse {
    private String locationId;
    private String address;
    private String description;
    private int totalCapacity;
    private int averageOccupancy;
    private String imageUrl;
    private String rating;
}