package com.example.Cat_CheckList_BackEnd_GroupProject.services;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Animal;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.Task;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.User;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.AnimalRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.TaskRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    TaskRepository taskRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void addNewUser(User user){
        userRepository.save(user);
    }

    public User saveUser(User user){
       return userRepository.save(user);
    }

    public User getUserById(long id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(Long id) {
        User user = userRepository.findById(id).get();
        for (Animal animal : user.getAnimals()){
            for (Task task : animal.getTasks()){
                taskRepository.delete(task);
            }
            animalRepository.delete(animal);
        }
        userRepository.deleteById(id);
    }

    public User updateUserName(String name, Long id) {
        User user = userRepository.findById(id).get();
        user.setName(name);
        return userRepository.save(user);
    }

}
