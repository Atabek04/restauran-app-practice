package com.restaurant.service;

import com.restaurant.dto.LoginRequest;
import com.restaurant.dto.SignupRequest;
import com.restaurant.dto.JwtResponse;

public interface AuthService {
    JwtResponse signUp(SignupRequest signupRequest);
    JwtResponse signIn(LoginRequest loginRequest);
}
