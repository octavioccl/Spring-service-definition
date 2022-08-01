package com.example.users.controllers;

import com.example.users.models.User;
import com.example.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UserService service;

    @GetMapping()
    public List<User> getAll() throws IOException {
        return service.getAll();
    }
}
