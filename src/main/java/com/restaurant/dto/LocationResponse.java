package com.restaurant.dto;

import lombok.Data;

@Data
public class LocationResponse {

    private Long id;
    private String name;
    private String address;

    public LocationResponse(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
