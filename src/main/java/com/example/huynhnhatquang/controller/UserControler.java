package com.example.huynhnhatquang.controller;


import com.example.huynhnhatquang.model.User;
import com.example.huynhnhatquang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControler {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    List<User> getUsers(){
        return userRepository.findAll();
    }
}
