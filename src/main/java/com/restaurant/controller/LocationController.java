package com.restaurant.controller;

import com.restaurant.dto.LocationResponse;
import com.restaurant.dto.SpecialityDishResponse;
import com.restaurant.dto.FeedbackResponse;
import com.restaurant.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;

    @GetMapping
    public List<LocationResponse> getAllLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("/{id}")
    public LocationResponse getLocationById(@PathVariable String id) {  // Changed Long to String for DynamoDB compatibility
        return locationService.getLocationById(id);
    }

    @GetMapping("/{id}/speciality-dishes")
    public List<SpecialityDishResponse> getSpecialityDishesByLocation(@PathVariable String id) {  // Changed Long to String for DynamoDB compatibility
        return locationService.getSpecialityDishesByLocation(id);
    }

    @GetMapping("/{id}/feedbacks")
    public List<FeedbackResponse> getFeedbacksByLocation(@PathVariable String id) {  // Changed Long to String for DynamoDB compatibility
        return locationService.getFeedbacksByLocation(id);
    }
}