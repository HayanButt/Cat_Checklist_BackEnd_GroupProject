package com.example.Cat_CheckList_BackEnd_GroupProject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "animal_types")
public class AnimalType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(mappedBy = "animalType")
    @JsonIgnoreProperties({"animalType"})
    private List<Animal> animals;

    @Column
    private String animalTypeName;

//  Creates an implicit relationship between AnimalType and TaskTypeEnums.
    @ElementCollection(targetClass = TaskTypeEnums.class)
    @Enumerated(EnumType.STRING)
    @JoinTable(name = "availableTasks", joinColumns = @JoinColumn(name = "animal_type_id"))
    @Column(name = "task")
    private List<TaskTypeEnums> availableTasks;

    public AnimalType(String animalTypeName){
        this.animalTypeName = animalTypeName;
        this.animals = new ArrayList<>();
        this.availableTasks = new ArrayList<>();
    }
    public AnimalType(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public String getAnimalTypeName() {
        return animalTypeName;
    }

    public void setAnimalTypeName(String animalTypeName) {
        this.animalTypeName = animalTypeName;
    }

    public List<TaskTypeEnums> getAvailableTasks() {
        return availableTasks;
    }

    public void setAvailableTasks(List<TaskTypeEnums> availableTasks) {
        this.availableTasks = availableTasks;
    }
}
