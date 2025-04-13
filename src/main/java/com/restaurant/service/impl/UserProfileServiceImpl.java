package com.restaurant.service.impl;

import com.restaurant.dto.UserProfileResponse;
import com.restaurant.model.User;
import com.restaurant.repository.UserRepository;
import com.restaurant.service.UserProfileService;
lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProfileServiceImpl implements UserProfileService {

    private final UserRepository userRepository;

    @Override
    public UserProfileResponse getUserProfile() {
        String email = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found"));
        return new UserProfileResponse(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getRole().getName());
    }
}
