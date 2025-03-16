package com.tech.padawan.bookmanager.usermanagement.application.usecases;

import com.tech.padawan.bookmanager.usermanagement.application.dto.UserRegister;
import com.tech.padawan.bookmanager.usermanagement.application.dto.UserResponse;
import com.tech.padawan.bookmanager.usermanagement.domain.exceptions.user.UserAlreadyExistsException;
import com.tech.padawan.bookmanager.usermanagement.domain.model.user.User;
import com.tech.padawan.bookmanager.usermanagement.domain.repository.UserRepository;

import java.util.List;

public class FindAllUsersCase {
    private final UserRepository userRepository;


    public FindAllUsersCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserResponse> execute(){
        List<User> users = userRepository.findAll();
        return UserResponse.toUserResponseList(users);
    }
}
