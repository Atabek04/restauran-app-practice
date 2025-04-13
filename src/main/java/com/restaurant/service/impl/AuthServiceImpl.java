package com.restaurant.service.impl;

import com.restaurant.dto.LoginRequest;
import com.restaurant.dto.SignupRequest;
import com.restaurant.dto.JwtResponse;
import com.restaurant.model.User;
import com.restaurant.repository.UserRepository;
import com.restaurant.security.JwtUtils;
import com.restaurant.service.AuthService;
lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtils jwtUtils;

    @Override
    public JwtResponse signUp(SignupRequest signupRequest) {
        // Implement sign-up logic
    }

    @Override
    public JwtResponse signIn(LoginRequest loginRequest) {
        // Implement sign-in logic
    }
}
