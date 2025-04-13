package com.restaurant.service.impl;

import com.restaurant.dto.LocationResponse;
import com.restaurant.dto.SpecialityDishResponse;
import com.restaurant.repository.LocationRepository;
import com.restaurant.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<LocationResponse> getAllLocations() {
        // Implement logic to get all locations
        return null;
    }

    @Override
    public LocationResponse getLocationById(String id) {
        // Implement logic to get location by id
        return null;
    }

    @Override
    public List<SpecialityDishResponse> getSpecialityDishes(String locationId) {
        // Implement logic to get speciality dishes
        return null;
    }
}