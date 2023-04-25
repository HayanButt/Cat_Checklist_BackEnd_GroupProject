package com.example.Cat_CheckList_BackEnd_GroupProject.controllers;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Task;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.TaskServices;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.UserServices;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(value = "/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable long id){
        return new ResponseEntity<>(taskServices.getTaskById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/{catId}/{taskId}")
    public ResponseEntity<Task> addNewTask(@PathVariable Long catId, @PathVariable long taskId, @RequestBody Task task){
        return new ResponseEntity<>(taskServices.saveNewTask(catId, taskId, task), HttpStatus.CREATED);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestParam Optional<String> content, @RequestParam Optional<Boolean> completed){
        if(content.isPresent()){
            return new ResponseEntity<>(taskServices.updateTaskContent(id, content.get()), HttpStatus.OK);
        } if (completed.isPresent()){
            return new ResponseEntity<>(taskServices.markAsCompleted(id, completed.get()), HttpStatus.OK);
        } return new ResponseEntity<>(taskServices.getTaskById(id), HttpStatus.OK);
    }

}
