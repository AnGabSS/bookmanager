package com.tech.padawan.bookmanager.usermanagement.application.repository;

import com.tech.padawan.bookmanager.usermanagement.application.dto.UserRegister;
import com.tech.padawan.bookmanager.usermanagement.domain.model.user.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> findAll();
    Optional<User> findById(Long id);
    User save(UserRegister user);
    User update(User user);
    void delete(User user);
}
