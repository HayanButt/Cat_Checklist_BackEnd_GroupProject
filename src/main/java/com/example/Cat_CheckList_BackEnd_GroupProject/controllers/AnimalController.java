package com.example.Cat_CheckList_BackEnd_GroupProject.controllers;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Animal;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.AnimalDTO;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.AnimalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    AnimalServices animalServices;

//     Index
    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals(){
        return new ResponseEntity<>(animalServices.getAllAnimals(), HttpStatus.OK);
    }

//    Show
    @GetMapping(value = "/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable Long id){
        return new ResponseEntity<>(animalServices.getAnimalById(id), HttpStatus.OK);
    }

//    Create
    @PostMapping
    public ResponseEntity<Animal> addNewAnimal(@RequestBody AnimalDTO animalDTO){
        Animal animal = animalServices.saveNewAnimal(animalDTO);
        return new ResponseEntity<>(animal, HttpStatus.CREATED);
    }

//    Destroy
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteAnimal(@PathVariable Long id){
        animalServices.deleteAnimal(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
