package com.restaurant.dto;

public class LocationResponse {

    private Long id;
    private String name;
    private String address;

    public LocationResponse(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
}
