package com.restaurant.service;

import com.restaurant.model.User;
import com.restaurant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserProfileService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserProfileById(Long id) {
        return userRepository.findById(id);
    }

    public User saveUserProfile(User user) {
        return userRepository.save(user);
    }

    public void deleteUserProfile(Long id) {
        userRepository.deleteById(id);
    }
}