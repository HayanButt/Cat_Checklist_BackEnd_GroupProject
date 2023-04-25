package com.example.Cat_CheckList_BackEnd_GroupProject.repositories;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.TaskType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskTypeRepository extends JpaRepository<TaskType, Long> {
}
