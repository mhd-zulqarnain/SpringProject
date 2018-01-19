package com.example.mysqdemo.controller;

import com.example.mysqdemo.model.Tasks;
import com.example.mysqdemo.model.Tests;
import com.example.mysqdemo.model.Users;
import com.example.mysqdemo.repository.TaskRepository;
import com.example.mysqdemo.repository.TestRepository;
import com.example.mysqdemo.repository.UserRepository;
import org.aspectj.weaver.ast.Test;
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
    @Autowired
    TaskRepository dosRepository;
    @Autowired
    TestRepository testRepository;

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

   /* @PostMapping(value = "newDo")
    public List<Tasks> newTask(@RequestBody Tasks dos){
        dosRepository.save(dos);
        return dosRepository.findAll();
    }*/
    @RequestMapping(value = "/test")
    public List<Tests> gettest(){
        return testRepository.findAll();
    }
    @RequestMapping(value = "/allTask")
    public List<Tasks> getAlltasks(){
        return dosRepository.findAll();
    }
  /*  @RequestMapping(name="id/{uid}")
    public Tasks getDo(@PathVariable(name = "uid") int uid) {
        return dosRepository.findByUid(uid);
    }*/
}
