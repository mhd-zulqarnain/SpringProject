package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zul Qarnain on 1/3/2018.
 */
@RestController
@RequestMapping("index")
public class HelloResource {
    @GetMapping
    public String hello(){
        return "youtube";
    }

}
