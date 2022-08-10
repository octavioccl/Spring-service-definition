package com.example.users.services;

import com.example.users.models.User;

import java.io.IOException;
import java.util.List;

public interface UserService {
     void save(User newUser);
    Iterable<User> getAll()  throws IOException;
}
