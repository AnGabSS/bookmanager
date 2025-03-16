package com.tech.padawan.bookmanager.usermanagement.domain.exceptions.user;

public class UserAlreadyExistsException extends RuntimeException{

    public UserAlreadyExistsException(String message){
        super(message);
    }
}
