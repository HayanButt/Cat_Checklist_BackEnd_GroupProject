package com.example.Cat_CheckList_BackEnd_GroupProject.controllers;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Cat;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.CatServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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







}
