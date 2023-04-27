package com.example.Cat_CheckList_BackEnd_GroupProject.controllers;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Task;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.TaskDTO;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.TaskType;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.TaskTypeEnums;
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

//    Index
    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(@RequestParam(required = false) TaskType taskTypeId){
        if(taskTypeId != null){
            return new ResponseEntity<>(taskServices.findByTaskType(taskTypeId), HttpStatus.OK);
        }
        return new ResponseEntity<>(taskServices.getAllTasks(), HttpStatus.OK);
    }

//    Show
    @GetMapping(value = "/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable long id){
        return new ResponseEntity<>(taskServices.getTaskById(id), HttpStatus.OK);
    }

//    Create
    @PostMapping
    public ResponseEntity<Task> addNewTask(@RequestBody TaskDTO taskDTO){
        Task task = taskServices.saveNewTask(taskDTO);
        return new ResponseEntity<>(task, HttpStatus.CREATED);
    }

//    Update
    @PutMapping(value = "/{id}")
    public ResponseEntity<Task> updateTask(@RequestBody TaskDTO taskDTO, @PathVariable Long id){
        Task task = taskServices.updateTask(taskDTO, id);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

//    Destroy
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteTask (@PathVariable Long id){
        taskServices.deleteTask(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
