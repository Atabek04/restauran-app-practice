package com.restaurant.service.impl;

import com.restaurant.dto.LocationResponse;
import com.restaurant.dto.SpecialityDishResponse;
import com.restaurant.dto.FeedbackResponse;
import com.restaurant.model.Location;
import com.restaurant.repository.LocationRepository;
import com.restaurant.service.LocationService;
lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    @Override
    public List<LocationResponse> getAllLocations() {
        // Implement logic to get all locations
    }

    @Override
    public LocationResponse getLocationById(String id) {
        // Implement logic to get location by id
    }

    @Override
    public List<SpecialityDishResponse> getSpecialityDishesByLocationId(String id) {
        // Implement logic to get speciality dishes by location id
    }

    @Override
    public List<FeedbackResponse> getFeedbacksByLocationId(String id, String type, String sort, Integer page, Integer size) {
        // Implement logic to get feedbacks by location id
    }
}
