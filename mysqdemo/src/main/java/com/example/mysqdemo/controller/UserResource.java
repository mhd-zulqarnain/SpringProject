package com.example.mysqdemo.controller;

import com.example.mysqdemo.model.Users;
import com.example.mysqdemo.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Zul Qarnain on 1/8/2018.
 */
@RestController
@RequestMapping(value = "/rest")
public class UserResource {

    @Autowired
    UserRepository userRepository;
    @GetMapping(value = "/all")
    public List<Users> getAll(){
        return userRepository.findAll();
    }

    @PostMapping(value = "/create")
    public List<Users> createUser(@RequestBody Users user){
        userRepository.save(user);
        return userRepository.findAll();
    }

    @GetMapping(value = "user/{name}")  /// http://localhost:8080/rest/user/ali
    public Users getUser(@PathVariable(name="name")String name){
        return userRepository.findByName(name);
    }
}
