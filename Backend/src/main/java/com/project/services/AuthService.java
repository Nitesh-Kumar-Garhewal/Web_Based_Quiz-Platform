package com.project.services;

import com.project.models.LoginRequest;
import com.project.models.LoginResponse;
import com.project.models.User;

public interface AuthService {
    User registerUserService(User user) throws Exception;

    LoginResponse loginUserService(LoginRequest loginRequest) throws Exception;
}
