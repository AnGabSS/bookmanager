package com.tech.padawan.bookmanager.usermanagement.application.service;

import com.tech.padawan.bookmanager.usermanagement.application.dto.UserRegister;
import com.tech.padawan.bookmanager.usermanagement.application.dto.UserResponse;
import com.tech.padawan.bookmanager.usermanagement.domain.model.user.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserResponse> findAll();
    Optional<UserResponse> findById(Long id);
    UserResponse save(UserRegister user);
    UserResponse update(User user);
    void delete(User user);
}
