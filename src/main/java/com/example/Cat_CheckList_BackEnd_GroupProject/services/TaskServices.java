package com.example.Cat_CheckList_BackEnd_GroupProject.services;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Task;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServices {

    @Autowired
    TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void saveTask(Task task){
        taskRepository.save(task);
    }


}
