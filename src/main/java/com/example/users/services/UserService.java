package com.example.users.services;

import com.example.users.models.User;
import org.springframework.stereotype.Service;

import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    public List<User> getAll() throws IOException {
        InputStream inputStream = Resources.getResource("static/people.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<User>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }
}
