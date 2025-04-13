package com.restaurant.controller;

import com.restaurant.dto.UserProfileResponse;
import com.restaurant.service.UserProfileService;
lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/profile")
@RequiredArgsConstructor
public class UserProfileController {

    private final UserProfileService userProfileService;

    @GetMapping
    public UserProfileResponse getUserProfile() {
        return userProfileService.getUserProfile();
    }
}
