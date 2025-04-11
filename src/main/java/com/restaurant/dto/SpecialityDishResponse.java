package com.restaurant.dto;

public class SpecialityDishResponse {

    private Long id;
    private String name;
    private String description;

    public SpecialityDishResponse(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
}
