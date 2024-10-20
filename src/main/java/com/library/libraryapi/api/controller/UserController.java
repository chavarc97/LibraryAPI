package com.library.libraryapi.api.controller;

import com.library.libraryapi.api.model.User;
import com.library.libraryapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public User getUser(@RequestParam Integer id) {
        return userService.getUser(id);
    }
}
