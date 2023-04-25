package com.example.Cat_CheckList_BackEnd_GroupProject.components;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.*;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.CatRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.TaskRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.UserRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.CatServices;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.TaskServices;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.TaskTypeServices;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserServices userServices;
    @Autowired
    CatServices catServices;
    @Autowired
    TaskServices taskServices;

    @Autowired
    TaskTypeServices taskTypeServices;

    @Override
    public void run(ApplicationArguments args) throws Exception{

//        Users
        User user1 = new User("Yasmin");
        userServices.addNewUser(user1);

        User user2 = new User("Thibyaa");
        userServices.addNewUser(user2);

        User user3 = new User("Alex");
        userServices.addNewUser(user3);

        User user4 = new User("Tharahan");
        userServices.addNewUser(user4);

//        Cats

      Cat cat1 = new Cat(user2, "Theo", "25/12/2021");
      catServices.addNewCat(cat1);

      Cat cat2 = new Cat(user2, "Tora", "07/01/2022");
      catServices.addNewCat(cat2);

      Cat cat3 = new Cat(user1, "Lina", "25/08/2022");
      catServices.addNewCat(cat3);

      Cat cat4 = new Cat(user3, "Wilbur", "14/07/2016");
      catServices.addNewCat(cat4);

      Cat cat5 = new Cat(user4, "Nicky", "16/05/2019");
      catServices.addNewCat(cat5);

//      TaskType
        TaskType taskType1 = new TaskType(TaskTypeEnums.FEEDING);
        taskTypeServices.saveTaskType(taskType1);

        TaskType taskType2 = new TaskType(TaskTypeEnums.GROOMING);
        taskTypeServices.saveTaskType(taskType2);

        TaskType taskType3 = new TaskType(TaskTypeEnums.MEDICATION);
        taskTypeServices.saveTaskType(taskType3);

        TaskType taskType4 = new TaskType(TaskTypeEnums.WATER);
        taskTypeServices.saveTaskType(taskType4);

        TaskType taskType5 = new TaskType(TaskTypeEnums.PLAYTIME);
        taskTypeServices.saveTaskType(taskType5);

        TaskType taskType6 = new TaskType(TaskTypeEnums.LITTERBOX);
        taskTypeServices.saveTaskType(taskType6);

        TaskType taskType7 = new TaskType(TaskTypeEnums.MAINTENANCE);
        taskTypeServices.saveTaskType(taskType7);

        TaskType taskType8 = new TaskType(TaskTypeEnums.VETENARYCARE);
        taskTypeServices.saveTaskType(taskType8);

//      Tasks
        Task task1 = new Task("brushing hair", false, "26.04.2023", Priority.LOW, cat4, taskType2);
        taskServices.saveTask(task1);
        Task task2 = new Task("changing the water", false, "26.04.2023", Priority.LOW, cat4, taskType4);
        taskServices.saveTask(task2);
        Task task3 = new Task("doing nails", false, "26.04.2023", Priority.LOW, cat4, taskType2);
        taskServices.saveTask(task3);
    }

}
