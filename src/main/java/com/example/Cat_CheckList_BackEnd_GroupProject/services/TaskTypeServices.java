package com.example.Cat_CheckList_BackEnd_GroupProject.services;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.TaskType;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.TaskTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskTypeServices {

    @Autowired
    TaskTypeRepository taskTypeRepository;

    public void saveTaskType(TaskType taskType){
        taskTypeRepository.save(taskType);
    }

}
