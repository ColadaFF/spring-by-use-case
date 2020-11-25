package com.example.demo.users.services;

import com.example.demo.users.model.CreateUserRequest;
import com.example.demo.users.model.CreateUserResponse;
import com.example.demo.users.usecases.CreateUserUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService implements CreateUserUseCase {

    @Override
    public CreateUserResponse process(CreateUserRequest request) {
        return null;
    }
}
