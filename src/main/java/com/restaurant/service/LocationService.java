package com.restaurant.service;

import com.restaurant.dto.LocationResponse;
import com.restaurant.dto.SpecialityDishResponse;
import com.restaurant.dto.FeedbackResponse;

import java.util.List;

public interface LocationService {
    List<LocationResponse> getAllLocations();
    LocationResponse getLocationById(String id);
    List<SpecialityDishResponse> getSpecialityDishesByLocationId(String id);
    List<FeedbackResponse> getFeedbacksByLocationId(String id, String type, String sort, Integer page, Integer size);
}
