package com.example.Cat_CheckList_BackEnd_GroupProject.services;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.*;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.AnimalRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.AnimalTypeRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.TaskRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServices {
    @Autowired
    AnimalRepository animalRepository;
    @Autowired
    UserRepository userRepository;

    @Autowired
    TaskRepository taskRepository;
    @Autowired
    AnimalTypeRepository animalTypeRepository;
    public void addNewAnimal(Animal animal){
        animalRepository.save(animal);
    }


    public List<Animal> getAllAnimals(){
        return animalRepository.findAll();

    }
    public Animal getAnimalById(Long id) {
        return animalRepository.findById(id).get();

    }

    public Animal saveNewAnimal(AnimalDTO animalDTO) {

        User user = userRepository.findById(animalDTO.getUserId()).get();

        Animal animal = new Animal(user,animalDTO.getName(),animalDTO.getBirthday(), animalTypeRepository.findById(animalDTO.getAnimalTypeId()).get());
        return animalRepository.save(animal);
    }


    public void deleteAnimal(Long id) {
        Animal animal = animalRepository.findById(id).get();
        for (Task task : animal.getTasks()){
            taskRepository.delete(task);
        }
        animalRepository.delete(animal);
    }
}
