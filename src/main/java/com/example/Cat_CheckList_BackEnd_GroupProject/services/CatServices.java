package com.example.Cat_CheckList_BackEnd_GroupProject.services;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Cat;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.User;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServices {
    @Autowired
    CatRepository catRepository;
    public void addNewCat(Cat cat){
        catRepository.save(cat);
    }

    public void saveCat(Cat cat) {
    }

    public List<Cat> getAllCats(){
        return catRepository.findAll();

    }
}
