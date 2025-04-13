package com.restaurant.controller;

import com.restaurant.dto.LocationResponse;
import com.restaurant.dto.SpecialityDishResponse;
import com.restaurant.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<LocationResponse> getAllLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LocationResponse getLocationById(@PathVariable String id) {
        return locationService.getLocationById(id);
    }

    @GetMapping("/{id}/speciality-dishes")
    @ResponseStatus(HttpStatus.OK)
    public List<SpecialityDishResponse> getSpecialityDishes(@PathVariable String id) {
        return locationService.getSpecialityDishes(id);
    }
}