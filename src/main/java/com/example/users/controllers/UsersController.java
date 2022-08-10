package com.example.users.controllers;

import com.example.users.models.User;
import com.example.users.services.UserService;
import com.example.users.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UsersController {

    private final UserService service;

    @Autowired
    public UsersController(UserService service)
    {
        this.service=service;
    }

    @GetMapping()
    public Iterable<User> getAll() throws IOException {
        return service.getAll();
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = User.builder().firstName(name).email(email).build();
        service.save(n);
        return "Saved";
    }
}
