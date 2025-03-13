package com.tech.padawan.bookmanager.usermanagement.application.dto;

import com.tech.padawan.bookmanager.usermanagement.domain.model.user.User;
import com.tech.padawan.bookmanager.usermanagement.domain.model.user.UserType;

public record UserRegister(String name, String email, String password, UserType type) {
        public static User toUser(UserRegister userRegister){
            return new User(null, userRegister.name, userRegister.email, userRegister.password, userRegister.type);
        }

}
