package com.example.Cat_CheckList_BackEnd_GroupProject.controllers;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Task;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.TaskServices;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.UserServices;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    UserServices userServices;

    @Autowired
    TaskServices taskServices;

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        return new ResponseEntity<>(taskServices.getAllTasks(), HttpStatus.OK);
    }



}
