package com.example.Cat_CheckList_BackEnd_GroupProject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "task_types")
public class TaskType {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "task_type_name")
    private TaskTypeEnums taskTypeName;
    @OneToMany(mappedBy = "task_type")
    @JsonIgnoreProperties({"task_type"})
    private List<Task> tasks;

    public TaskType(TaskTypeEnums taskTypeName){
        this.taskTypeName = taskTypeName;
        this.tasks = new ArrayList<>();
    }

    public TaskType(){

    }

//    SETTERS & GETTERS


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TaskTypeEnums getTaskTypeName() {
        return taskTypeName;
    }

    public void setTaskTypeName(TaskTypeEnums taskTypeName) {
        this.taskTypeName = taskTypeName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
