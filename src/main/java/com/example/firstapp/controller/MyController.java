package com.example.firstapp.controller;

import com.example.firstapp.UserData;
import com.example.firstapp.entity.UserDetails;
import com.example.firstapp.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/welcome")
    public String welcome(){
        return  "Welcome to Spring boot program";
    }

    @PostMapping("/addUser")
    public ResponseEntity AddUser(@Valid @RequestBody UserData userData){
        UserDetails userDetails = myService.AddUserData(userData);
           return new ResponseEntity<>(userDetails, HttpStatus.CREATED);
    }


    @GetMapping("/users")
    public ResponseEntity getUsers(){
       List<UserDetails> userDetails = myService.userRepo.findAll();
        return new ResponseEntity<>(userDetails, HttpStatus.CREATED);
    }

}
