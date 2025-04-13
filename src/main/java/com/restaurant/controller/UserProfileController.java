package com.restaurant.controller;

import com.restaurant.dto.UserProfileResponse;
import com.restaurant.service.UserProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserProfileController {

    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping("/profile")
    @ResponseStatus(HttpStatus.OK)
    public UserProfileResponse getUserProfile(@RequestParam String userId) {
        return userProfileService.getUserProfile(userId);
    }
}