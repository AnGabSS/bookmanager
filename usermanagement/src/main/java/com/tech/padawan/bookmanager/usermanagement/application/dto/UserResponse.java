package com.tech.padawan.bookmanager.usermanagement.application.dto;

import com.tech.padawan.bookmanager.usermanagement.domain.model.user.User;
import com.tech.padawan.bookmanager.usermanagement.domain.model.user.UserType;

import java.util.List;

public record UserResponse(Long id, String name, String email, UserType type) {

    public static List<UserResponse> toUserResponseList(List<User> users){
        return users.stream().map(UserResponse::toUserResponse).toList();
    }

    public static UserResponse toUserResponse(User user) {
        return new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getType());
    }

}
