package com.restaurant.service;

import com.restaurant.dto.SpecialityDishResponse;
import com.restaurant.model.SpecialityDish;
import com.restaurant.repository.SpecialityDishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpecialityDishService {

    @Autowired
    private SpecialityDishRepository specialityDishRepository;

    public List<SpecialityDishResponse> getAllSpecialityDishes() {
        return specialityDishRepository.findAll().stream()
                .map(dish -> new SpecialityDishResponse(dish.getId(), dish.getName(), dish.getDescription()))
                .collect(Collectors.toList());
    }

    public SpecialityDishResponse getSpecialityDishById(Long id) {
        SpecialityDish dish = specialityDishRepository.findById(id).orElseThrow(() -> new RuntimeException("Speciality Dish not found"));
        return new SpecialityDishResponse(dish.getId(), dish.getName(), dish.getDescription());
    }
}
