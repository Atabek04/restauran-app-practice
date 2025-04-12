package com.restaurant.controller;

import com.restaurant.dto.SpecialityDishResponse;
import com.restaurant.service.SpecialityDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/speciality-dishes")
public class SpecialityDishController {

    @Autowired
    private SpecialityDishService specialityDishService;

    @GetMapping
    public List<SpecialityDishResponse> getAllSpecialityDishes() {
        return specialityDishService.getAllSpecialityDishes();
    }

    @GetMapping("/{id}")
    public SpecialityDishResponse getSpecialityDishById(@PathVariable String id) {
        return specialityDishService.getSpecialityDishById(id);
    }
}
