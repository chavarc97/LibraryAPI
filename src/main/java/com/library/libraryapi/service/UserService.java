package com.library.libraryapi.service;

import com.library.libraryapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> usersList;

    public UserService(){
        usersList = new ArrayList<>();
    }


}
