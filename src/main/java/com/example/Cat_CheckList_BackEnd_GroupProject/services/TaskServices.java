package com.example.Cat_CheckList_BackEnd_GroupProject.services;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Cat;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.Task;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.TaskType;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.CatRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.TaskRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.TaskTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServices {

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    CatRepository catRepository;

    @Autowired
    TaskTypeRepository taskTypeRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void saveTask(Task task){
        taskRepository.save(task);
    }

    public Task getTaskById(long id) {
        return taskRepository.findById(id).get();
    }

    public Task saveNewTask(Long id, Long taskId, Task task) {
        Cat cat = catRepository.findById(id).get(); // taskDTO.getCatId()
        TaskType taskType = taskTypeRepository.findById(taskId).get();
        task = new Task(task.getContent(), task.isCompleted(), task.getDueDate(), task.getPriority(), cat, taskType);
        return taskRepository.save(task);
    }

    public Task updateTaskContent(Long id, String content) {
        Task task = taskRepository.findById(id).get();
        task.setContent(content);
        return taskRepository.save(task);
    }

    public Task markAsCompleted(Long id, Boolean aBoolean) {
        Task task = taskRepository.findById(id).get();
        task.setCompleted(true);
        return taskRepository.save(task);
    }
}
