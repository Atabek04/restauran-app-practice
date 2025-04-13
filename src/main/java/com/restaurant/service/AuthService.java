package com.restaurant.service;

import com.restaurant.dto.JwtResponse;
import com.restaurant.dto.LoginRequest;
import com.restaurant.dto.SignupRequest;

public interface AuthService {
    JwtResponse signIn(LoginRequest loginRequest);
    void signUp(SignupRequest signUpRequest);
}