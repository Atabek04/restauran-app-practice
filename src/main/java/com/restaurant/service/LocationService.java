package com.restaurant.service;

import com.restaurant.dto.LocationResponse;
import com.restaurant.dto.SpecialityDishResponse;

import java.util.List;

public interface LocationService {
    List<LocationResponse> getAllLocations();
    LocationResponse getLocationById(Long id);
    List<SpecialityDishResponse> getSpecialityDishes(String locationId);
}