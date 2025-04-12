package com.restaurant.service;

import com.restaurant.dto.DishResponse;
import com.restaurant.model.Dish;
import com.restaurant.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DishService {

    @Autowired
    private DishRepository dishRepository;

    public List<DishResponse> getAllDishes() {
        return dishRepository.findAll().stream()
                .map(dish -> DishResponse.builder()
                        .dishId(dish.getDishId())
                        .calories(dish.getCalories())
                        .carbohydrates(dish.getCarbohydrates())
                        .category(dish.getCategory())
                        .description(dish.getDescription())
                        .fats(dish.getFats())
                        .imageUrl(dish.getImageUrl())
                        .ingredients(dish.getIngredients())
                        .isOnStop(dish.isOnStop())
                        .name(dish.getName())
                        .orderCounter(dish.getOrderCounter())
                        .price(dish.getPrice())
                        .protein(dish.getProtein())
                        .vitaminsMinerals(dish.getVitaminsMinerals())
                        .weight(dish.getWeight())
                        .build())
                .collect(Collectors.toList());
    }

    public DishResponse getDishById(String dishId) {
        Dish dish = dishRepository.findById(dishId).orElseThrow(() -> new RuntimeException("Dish not found"));
        return DishResponse.builder()
                .dishId(dish.getDishId())
                .calories(dish.getCalories())
                .carbohydrates(dish.getCarbohydrates())
                .category(dish.getCategory())
                .description(dish.getDescription())
                .fats(dish.getFats())
                .imageUrl(dish.getImageUrl())
                .ingredients(dish.getIngredients())
                .isOnStop(dish.isOnStop())
                .name(dish.getName())
                .orderCounter(dish.getOrderCounter())
                .price(dish.getPrice())
                .protein(dish.getProtein())
                .vitaminsMinerals(dish.getVitaminsMinerals())
                .weight(dish.getWeight())
                .build();
    }
}
