package com.restaurant.service.impl;

import com.restaurant.dto.UserProfileResponse;
import com.restaurant.repository.UserRepository;
import com.restaurant.service.UserProfileService;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserRepository userRepository;

    public UserProfileServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserProfileResponse getUserProfile(String userId) {
        // Implement logic to get user profile
        return null;
    }
}