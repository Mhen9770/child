package com.mahendra.userservice.controller;

import com.mahendra.userservice.request.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    public User getUser(){
        return new User(UUID.randomUUID().toString()
                ,"Mahendra Malviya"
                , "IT");
    }
//    "Satish Sarab Khandwa"
}
