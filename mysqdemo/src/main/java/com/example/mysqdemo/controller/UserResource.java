package com.example.mysqdemo.controller;

import com.example.mysqdemo.model.Todo;
import com.example.mysqdemo.model.Users;
import com.example.mysqdemo.repository.TaskRepository;
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
    TaskRepository dosRepository;

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

    @PostMapping(value = "newDo")
    public List<Todo> newTask(@RequestBody Todo dos){
        dosRepository.save(dos);
        return dosRepository.findAll();
    }
    @GetMapping(value = "/allTask")
    public List<Todo> getAlltasks(){
        return dosRepository.findAll();
    }
    @GetMapping(name="id/{uid}")
    public Todo getDo(@PathVariable(name = "uid") int uid) {
        return dosRepository.findByUid(uid);
    }
}
