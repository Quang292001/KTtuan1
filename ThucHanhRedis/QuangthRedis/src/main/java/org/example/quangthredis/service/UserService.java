package org.example.quangthredis.service;

import org.example.quangthredis.model.User;
import org.example.quangthredis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User saveUser(User user);
    public User getUser(Long id);
}
