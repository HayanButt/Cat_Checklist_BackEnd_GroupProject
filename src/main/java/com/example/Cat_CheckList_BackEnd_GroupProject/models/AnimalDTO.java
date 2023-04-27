package com.example.Cat_CheckList_BackEnd_GroupProject.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnimalDTO {


    private String name;

    private LocalDate birthday;

    private Long userId;

    private List<Task> tasks;

    private Long animalTypeId;


    public AnimalDTO(Long userId, String name, LocalDate birthday, Long animalTypeId){
        this.name = name;
        this.birthday = birthday;
        this.tasks = new ArrayList<>();
        this.userId = userId;
        this.animalTypeId = animalTypeId;

    }


    public AnimalDTO(){

    }

//    GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
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

    public Long getAnimalTypeId() {
        return animalTypeId;
    }

    public void setAnimalTypeId(Long animalTypeId) {
        this.animalTypeId = animalTypeId;
    }
}
