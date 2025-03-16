package com.tech.padawan.bookmanager.usermanagement.application.usecases;

import com.tech.padawan.bookmanager.usermanagement.application.dto.UserRegister;
import com.tech.padawan.bookmanager.usermanagement.application.dto.UserResponse;
import com.tech.padawan.bookmanager.usermanagement.domain.exceptions.user.UserAlreadyExistsException;
import com.tech.padawan.bookmanager.usermanagement.domain.model.user.User;
import com.tech.padawan.bookmanager.usermanagement.domain.repository.UserRepository;

import java.util.Optional;

public class RegisterUserCase {
    private final UserRepository userRepository;


    public RegisterUserCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse execute(UserRegister user){
        userRepository.findByEmail(user.email()).orElseThrow(() -> new UserAlreadyExistsException("User with this email already exists, choose other email."));
        User userCreated = userRepository.save(UserRegister.toUser(user));
        return UserResponse.toUserResponse(userCreated);
    }
}
