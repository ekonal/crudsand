package com.sandy.crudsand.service;

import com.sandy.crudsand.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService  {

    User save(User user);
    List<User> findAll();
    void delete(String id);
    User findOne(String username);
    User findById(String id);
}
