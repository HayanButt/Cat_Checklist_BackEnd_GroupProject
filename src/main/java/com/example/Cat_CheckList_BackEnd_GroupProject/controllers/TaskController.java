package com.example.Cat_CheckList_BackEnd_GroupProject.controllers;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Task;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.TaskDTO;
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

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(@RequestParam(required = false, name = "taskTypeEnum")TaskTypeEnums taskTypeEnums){
        if(taskTypeEnums != null){
            return new ResponseEntity<>(taskServices.findByTaskType(taskTypeEnums), HttpStatus.OK);
        }
        return new ResponseEntity<>(taskServices.getAllTasks(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable long id){
        return new ResponseEntity<>(taskServices.getTaskById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Task> addNewTask(@RequestBody TaskDTO taskDTO){
        Task task = taskServices.saveNewTask(taskDTO);
        return new ResponseEntity<>(task, HttpStatus.CREATED);
    }

//    @PatchMapping(value = "/{id}")
//    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestParam Optional<String> content, @RequestParam Optional<Boolean> completed){
//        if(content.isPresent()){
//            return new ResponseEntity<>(taskServices.updateTaskContent(id, content.get()), HttpStatus.OK);
//        } if (completed.isPresent()){
//            return new ResponseEntity<>(taskServices.markAsCompleted(id, completed.get()), HttpStatus.OK);
//        } return new ResponseEntity<>(taskServices.getTaskById(id), HttpStatus.OK);
//    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Task> updateTask(@RequestBody TaskDTO taskDTO, @PathVariable Long id){
        Task task = taskServices.updateTask(taskDTO, id);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteTask (@PathVariable Long id){
        taskServices.deleteTask(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
