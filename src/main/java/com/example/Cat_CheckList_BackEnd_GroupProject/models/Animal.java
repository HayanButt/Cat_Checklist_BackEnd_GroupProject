package com.example.Cat_CheckList_BackEnd_GroupProject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



@Entity(name = "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;
    @Column
    private LocalDate birthday;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"animals"})
    private User user;

    @ManyToOne
    @JoinColumn(name = "animal_type_id")
    @JsonIgnoreProperties({"animals"})
    private AnimalType animalType;


    @OneToMany(mappedBy = "animal")
    @JsonIgnoreProperties({"animals"})
    private List<Task> tasks;

    public Animal(User user, String name, LocalDate birthday, AnimalType animalType){
        this.name = name;
        this.birthday = birthday;
        this.tasks = new ArrayList<>();
        this.user = user;
        this.animalType = animalType;

    }


    public Animal(){

    }

//    GETTERS & SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }


    public void addUser(User user){
        this.user = user;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }
}
