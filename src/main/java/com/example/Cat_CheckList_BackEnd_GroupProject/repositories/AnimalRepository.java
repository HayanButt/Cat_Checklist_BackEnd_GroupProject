package com.example.Cat_CheckList_BackEnd_GroupProject.repositories;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
