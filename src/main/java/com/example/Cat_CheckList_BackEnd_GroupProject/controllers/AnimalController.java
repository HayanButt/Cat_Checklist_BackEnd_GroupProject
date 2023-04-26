package com.example.Cat_CheckList_BackEnd_GroupProject.controllers;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Cat;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.CatDTO;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.CatServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatController {
    @Autowired
    CatServices catServices;

    @GetMapping
    public ResponseEntity<List<Cat>> getAllCats(){
        return new ResponseEntity<>(catServices.getAllCats(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cat> getCatById(@PathVariable Long id){
        return new ResponseEntity<>(catServices.getCatById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cat> addNewCat(@RequestBody CatDTO catDTO){
        Cat cat = catServices.saveNewCat(catDTO);
        return new ResponseEntity<>(cat, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteCat(@PathVariable Long id){
        catServices.deleteCat(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }







}
