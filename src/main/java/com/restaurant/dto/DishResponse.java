package com.restaurant.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DishResponse {

    private String dishId;
    private int calories;
    private String carbohydrates;
    private String category;
    private String description;
    private String fats;
    private String imageUrl;
    private String ingredients;
    private boolean isOnStop;
    private String name;
    private int orderCounter;
    private int price;
    private String protein;
    private String vitaminsMinerals;
    private String weight;
}
