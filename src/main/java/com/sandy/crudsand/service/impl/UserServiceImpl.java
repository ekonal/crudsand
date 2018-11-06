package com.sandy.crudsand.service.impl;

import com.sandy.crudsand.model.User;
import com.sandy.crudsand.repository.UserRepository;
import com.sandy.crudsand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        userRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);

    }

    @Override
    public User findOne(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public User findById(String id) {
        return findById(id);
    }
}
