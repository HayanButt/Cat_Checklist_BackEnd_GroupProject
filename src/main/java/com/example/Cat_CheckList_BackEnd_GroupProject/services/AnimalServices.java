package com.example.Cat_CheckList_BackEnd_GroupProject.services;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Cat;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.CatDTO;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.User;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.CatRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServices {
    @Autowired
    CatRepository catRepository;
    @Autowired
    UserRepository userRepository;
    public void addNewCat(Cat cat){
        catRepository.save(cat);
    }


    public List<Cat> getAllCats(){
        return catRepository.findAll();

    }
    public Cat getCatById(Long id) {
        return catRepository.findById(id).get();

    }

    public Cat saveNewCat(CatDTO catDTO) {

        User user = userRepository.findById(catDTO.getUserId()).get();
        Cat cat = new Cat(user,catDTO.getName(),catDTO.getBirthday());
        return catRepository.save(cat);
    }


    public void deleteCat(Long id) {
        catRepository.deleteById(id);
    }
}
