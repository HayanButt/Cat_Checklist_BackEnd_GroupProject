package com.example.Cat_CheckList_BackEnd_GroupProject.repositories;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.AnimalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalTypeRepository extends JpaRepository<AnimalType, Long> {
}
