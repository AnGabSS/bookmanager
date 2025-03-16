package com.tech.padawan.bookmanager.usermanagement.infra.controller;

import com.tech.padawan.bookmanager.usermanagement.application.dto.UserRegister;
import com.tech.padawan.bookmanager.usermanagement.application.dto.UserResponse;
import com.tech.padawan.bookmanager.usermanagement.application.service.UserApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserApplicationService service;

    @Autowired
    public UserController(UserApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody UserRegister user){
        UserResponse userCreated = service.save(user);
        return ResponseEntity.ok("Usuario " + user.name() + "  criado com sucesso!");
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> findAll(){
        List<UserResponse> users = service.findAll();
        return ResponseEntity.ok(users);
    }
}
