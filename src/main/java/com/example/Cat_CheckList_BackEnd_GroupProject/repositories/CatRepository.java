package com.example.Cat_CheckList_BackEnd_GroupProject.repositories;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {
}
