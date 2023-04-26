package com.example.Cat_CheckList_BackEnd_GroupProject.services;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Animal;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.AnimalDTO;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.User;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.AnimalRepository;
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
        Animal animal = new Animal(user,animalDTO.getName(),animalDTO.getBirthday());
        return animalRepository.save(animal);
    }


    public void deleteAnimal(Long id) {
        animalRepository.deleteById(id);
    }
}
