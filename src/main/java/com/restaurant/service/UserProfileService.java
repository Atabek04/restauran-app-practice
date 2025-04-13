package com.restaurant.service;

import com.restaurant.dto.UserProfileResponse;

public interface UserProfileService {
    UserProfileResponse getUserProfile(String userId);
}