package com.tech.padawan.bookmanager.usermanagement.services;

import com.tech.padawan.bookmanager.usermanagement.application.dto.UserRegister;
import com.tech.padawan.bookmanager.usermanagement.application.dto.UserResponse;
import com.tech.padawan.bookmanager.usermanagement.domain.model.user.User;

public class RegisterUserService {

    public UserResponse registerUser(UserRegister user) {
        User userCreated = UserRegister.toUser(user);

        return UserResponse.toUserResponse(userCreated);
    }
}
