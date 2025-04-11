package com.restaurant.dto;

import lombok.Data;
import com.restaurant.model.Role;

import java.util.Set;

@Data
public class UserProfileResponse {

    private Long id;
    private String username;
    private String email;
    private Set<Role> roles;

    public UserProfileResponse(Long id, String username, String email, Set<Role> roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
