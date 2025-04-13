package com.restaurant.service.impl;

import com.restaurant.dto.LocationResponse;
import com.restaurant.dto.SpecialityDishResponse;
import com.restaurant.model.Location;
import com.restaurant.repository.LocationRepository;
import com.restaurant.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    @Override
    public List<LocationResponse> getAllLocations() {
        return locationRepository.findAll().stream()
                .map(location -> new LocationResponse(location.getId(), location.getName(), location.getAddress()))
                .collect(Collectors.toList());
    }

    @Override
    public LocationResponse getLocationById(Long id) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Location not found"));
        return new LocationResponse(location.getId(), location.getName(), location.getAddress());
    }

    @Override
    public List<SpecialityDishResponse> getSpecialityDishes(String locationId) {
        // Implement logic to get speciality dishes
        return null;
    }
}