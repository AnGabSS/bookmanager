package com.tech.padawan.bookmanager.usermanagement.domain.repository;

import com.tech.padawan.bookmanager.usermanagement.domain.model.user.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> findAll();
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String username);
    User save(User user);
    void delete(User user);
}
