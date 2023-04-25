package com.example.Cat_CheckList_BackEnd_GroupProject.controllers;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.User;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserServices userServices;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userServices.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id){
        return new ResponseEntity<>(userServices.getUserById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> addNewUser(@RequestBody User user){
        return new ResponseEntity<>(userServices.saveUser(user), HttpStatus.CREATED);
    }

}
