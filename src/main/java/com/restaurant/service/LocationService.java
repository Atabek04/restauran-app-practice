package com.restaurant.service;

import com.restaurant.dto.LocationResponse;
import com.restaurant.dto.SpecialityDishResponse;
import com.restaurant.dto.FeedbackResponse;
import com.restaurant.model.Location;
import com.restaurant.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<LocationResponse> getAllLocations() {
        return locationRepository.findAll().stream()
                .map(location -> new LocationResponse(location.getId(), location.getName(), location.getAddress()))
                .collect(Collectors.toList());
    }

    public LocationResponse getLocationById(Long id) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Location not found"));

        return new LocationResponse(location.getId(), location.getName(), location.getAddress());
    }

    public List<SpecialityDishResponse> getSpecialityDishesByLocation(Long id) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Location not found"));

        return location.getSpecialityDishes().stream()
                .map(dish -> new SpecialityDishResponse(dish.getId(), dish.getName(), dish.getDescription()))
                .collect(Collectors.toList());
    }

    public List<FeedbackResponse> getFeedbacksByLocation(Long id) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Location not found"));

        return location.getFeedbacks().stream()
                .map(feedback -> new FeedbackResponse(feedback.getId(), feedback.getComment(), feedback.getRating()))
                .collect(Collectors.toList());
    }
}
