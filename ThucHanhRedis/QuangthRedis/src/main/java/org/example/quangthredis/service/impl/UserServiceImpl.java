package org.example.quangthredis.service.impl;

import org.example.quangthredis.model.User;
import org.example.quangthredis.repository.UserRepository;
import org.example.quangthredis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public User getUser(Long id){
        return userRepository.findById(id).orElse(null);
    }
}
