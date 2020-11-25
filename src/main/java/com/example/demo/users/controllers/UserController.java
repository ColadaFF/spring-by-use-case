package com.example.demo.users.controllers;

import com.example.demo.users.model.CreateUserRequest;
import com.example.demo.users.model.CreateUserResponse;
import com.example.demo.users.usecases.CreateUserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;

    @Autowired
    public UserController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }


    @PostMapping
    public CreateUserResponse createUser(@RequestBody CreateUserRequest body) {
        return createUserUseCase.process(body);
    }
}
