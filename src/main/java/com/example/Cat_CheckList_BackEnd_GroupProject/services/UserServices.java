package com.example.Cat_CheckList_BackEnd_GroupProject.services;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Cat;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.User;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.CatRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;
    @Autowired
    CatRepository catRepository;

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
        for (Cat cat : user.getCats()){
            catRepository.delete(cat);
        }
        userRepository.deleteById(id);
    }
}
