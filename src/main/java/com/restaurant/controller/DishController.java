package com.restaurant.controller;

import com.restaurant.dto.DishResponse;
import com.restaurant.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dishes")
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping
    public List<DishResponse> getAllDishes() {
        return dishService.getAllDishes();
    }

    @GetMapping("/{id}")
    public DishResponse getDishById(@PathVariable String id) {
        return dishService.getDishById(id);
    }
}
