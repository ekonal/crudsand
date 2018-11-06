package com.sandy.crudsand.controller;

import com.sandy.crudsand.model.User;
import com.sandy.crudsand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/all")
    public List<User> getAllUsers(){
       return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable(value = "id") String id){
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable(value = "id") String id){
         userService.delete(id);
    }
}
