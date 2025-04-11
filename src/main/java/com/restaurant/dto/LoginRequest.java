package com.restaurant.dto;

import javax.validation.constraints.NotBlank;

public class LoginRequest {

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    // Getters and Setters
}
