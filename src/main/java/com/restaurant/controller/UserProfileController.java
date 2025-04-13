package com.restaurant.controller;

import com.restaurant.model.User;
import com.restaurant.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user-profiles")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserProfileById(@PathVariable Long id) {
        Optional<User> user = userProfileService.getUserProfileById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<User> createUserProfile(@RequestBody User user) {
        User savedUser = userProfileService.saveUserProfile(user);
        return ResponseEntity.ok(savedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserProfile(@PathVariable Long id) {
        userProfileService.deleteUserProfile(id);
        return ResponseEntity.noContent().build();
    }
}