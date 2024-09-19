package com.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class LoginResponse {
    private User user;
    private String jwtToken;
}
