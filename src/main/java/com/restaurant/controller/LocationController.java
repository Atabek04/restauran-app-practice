package com.restaurant.controller;

import com.restaurant.dto.LocationResponse;
import com.restaurant.dto.SpecialityDishResponse;
import com.restaurant.dto.FeedbackResponse;
import com.restaurant.service.LocationService;
lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public LocationResponse getLocationById(@PathVariable String id) {
        return locationService.getLocationById(id);
    }

    @GetMapping("/{id}/speciality-dishes")
    public List<SpecialityDishResponse> getSpecialityDishesByLocationId(@PathVariable String id) {
        return locationService.getSpecialityDishesByLocationId(id);
    }

    @GetMapping("/{id}/feedbacks")
    public List<FeedbackResponse> getFeedbacksByLocationId(@PathVariable String id,
                                                           @RequestParam String type,
                                                           @RequestParam(required = false) String sort,
                                                           @RequestParam(required = false) Integer page,
                                                           @RequestParam(required = false) Integer size) {
        return locationService.getFeedbacksByLocationId(id, type, sort, page, size);
    }
}
