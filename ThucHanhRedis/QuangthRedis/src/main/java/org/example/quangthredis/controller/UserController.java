package org.example.quangthredis.controller;

import org.example.quangthredis.model.User;
import org.example.quangthredis.service.UserService;
import org.example.quangthredis.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.example.quangthredis.repository.UserRepository;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public GetMapping getUserById(@PathVariable Long id) {

    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }

    // Add other methods for updating, deleting, or listing users as needed
}
