package com.example.Cat_CheckList_BackEnd_GroupProject.repositories;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Task;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.TaskType;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.TaskTypeEnums;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository  extends JpaRepository<Task, Long> {

    List<Task> findByTaskType(TaskType taskTypeId);

}
