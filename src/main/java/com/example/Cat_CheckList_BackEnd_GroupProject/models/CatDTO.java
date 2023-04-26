package com.example.Cat_CheckList_BackEnd_GroupProject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class CatDTO {


    private String name;

    private String birthday;

    private Long userId;

    private List<Task> tasks;


    public CatDTO( Long userId, String name, String birthday){

        this.name = name;
        this.birthday = birthday;
        this.tasks = new ArrayList<>();
        this.userId = userId;

    }


    public CatDTO(){

    }

//    GETTERS & SETTERS






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }







}
