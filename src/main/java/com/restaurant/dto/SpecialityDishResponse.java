package com.restaurant.dto;

import java.math.BigDecimal;

public class SpecialityDishResponse {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private boolean isVegetarian;

    public SpecialityDishResponse(Long id, String name, String description, BigDecimal price, boolean isVegetarian) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }
}