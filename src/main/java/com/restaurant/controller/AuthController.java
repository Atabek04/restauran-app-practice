package com.restaurant.controller;

import com.restaurant.dto.LoginRequest;
import com.restaurant.dto.SignupRequest;
import com.restaurant.dto.JwtResponse;
import com.restaurant.service.AuthService;
lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/sign-up")
    public JwtResponse signUp(@RequestBody SignupRequest signupRequest) {
        return authService.signUp(signupRequest);
    }

    @PostMapping("/sign-in")
    public JwtResponse signIn(@RequestBody LoginRequest loginRequest) {
        return authService.signIn(loginRequest);
    }
}
