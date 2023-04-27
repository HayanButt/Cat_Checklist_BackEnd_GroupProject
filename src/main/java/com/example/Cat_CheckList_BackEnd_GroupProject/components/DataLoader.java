package com.example.Cat_CheckList_BackEnd_GroupProject.components;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.*;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.AnimalTypeRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.AnimalServices;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.TaskServices;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.TaskTypeServices;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserServices userServices;
    @Autowired
    AnimalServices animalServices;
    @Autowired
    TaskServices taskServices;

    @Autowired
    AnimalTypeRepository animalTypeRepository;

    @Autowired
    TaskTypeServices taskTypeServices;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        USERS

        User user1 = new User("Yasmin");
        userServices.addNewUser(user1);

        User user2 = new User("Thibyaa");
        userServices.addNewUser(user2);

        User user3 = new User("Alex");
        userServices.addNewUser(user3);

        User user4 = new User("Tharahan");
        userServices.addNewUser(user4);

//        ANIMAL TYPE
        AnimalType animalType1 = new AnimalType("Cat");
        AnimalType animalType2 = new AnimalType("Dog");
        AnimalType animalType3 = new AnimalType("Fish");

//        CAT TYPE
        ArrayList<TaskTypeEnums> catTasks = new ArrayList<>();
        catTasks.add(TaskTypeEnums.LITTERBOX);
        catTasks.add(TaskTypeEnums.FEEDING);
        catTasks.add(TaskTypeEnums.GROOMING);
        catTasks.add(TaskTypeEnums.MEDICATION);
        catTasks.add(TaskTypeEnums.WATER);
        catTasks.add(TaskTypeEnums.PLAYTIME);
        catTasks.add(TaskTypeEnums.VETERINARYCARE);
        animalType1.setAvailableTasks(catTasks);
        animalTypeRepository.save(animalType1);

//        DOG TYPE
        ArrayList<TaskTypeEnums> dogTasks = new ArrayList<>();
        dogTasks.add(TaskTypeEnums.MEDICATION);
        dogTasks.add(TaskTypeEnums.FEEDING);
        dogTasks.add(TaskTypeEnums.GROOMING);
        dogTasks.add(TaskTypeEnums.WATER);
        dogTasks.add(TaskTypeEnums.PLAYTIME);
        dogTasks.add(TaskTypeEnums.VETERINARYCARE);
        animalType2.setAvailableTasks(dogTasks);
        animalTypeRepository.save(animalType2);

//        FISH TYPE
        ArrayList<TaskTypeEnums> fishTasks = new ArrayList<>();
        fishTasks.add(TaskTypeEnums.MAINTENANCE);
        fishTasks.add(TaskTypeEnums.FEEDING);
        animalType3.setAvailableTasks(fishTasks);
        animalTypeRepository.save(animalType3);

//        CATS

        Animal animal1 = new Animal(user2, "Theo", LocalDate.of(2021, 12, 25), animalType1);
        animalServices.addNewAnimal(animal1);

        Animal animal2 = new Animal(user2, "Tora", LocalDate.of(2022, 1,7), animalType1);
        animalServices.addNewAnimal(animal2);

        Animal animal3 = new Animal(user1, "Lina", LocalDate.of(2022, 8, 25), animalType1);
        animalServices.addNewAnimal(animal3);

        Animal animal4 = new Animal(user3, "Wilbur", LocalDate.of(2016, 7, 14), animalType1);
        animalServices.addNewAnimal(animal4);

        Animal animal5 = new Animal(user4, "Nicky", LocalDate.of(2019, 5, 16), animalType1);
        animalServices.addNewAnimal(animal5);

        Animal animal6 = new Animal(user3, "Percy", LocalDate.of(2014, 6, 10), animalType2);
        animalServices.addNewAnimal(animal6);

        Animal animal7 = new Animal(user3, "Lulu", LocalDate.of(2010, 5,8), animalType2);
        animalServices.addNewAnimal(animal7);

        Animal animal8 = new Animal(user4, "Phil", LocalDate.of(2016,4,15), animalType3);
        animalServices.addNewAnimal(animal8);

//      TASKTYPE

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

        TaskType taskType8 = new TaskType(TaskTypeEnums.VETERINARYCARE);
        taskTypeServices.saveTaskType(taskType8);

//      TASKS
        Task task1 = new Task("brushing hair", false, "26.04.2023", Priority.LOW, animal1, taskType2);
        taskServices.saveTask(task1);
        Task task2 = new Task("changing the water", false, "26.04.2023", Priority.LOW, animal2, taskType4);
        taskServices.saveTask(task2);
        Task task3 = new Task("trimming nails", false, "26.04.2023", Priority.LOW, animal3, taskType2);
        taskServices.saveTask(task3);
        Task task4 = new Task("going for a walk", false, "26.04.2023", Priority.LOW, animal6, taskType5);
        taskServices.saveTask(task4);
        Task task5 = new Task("playing fetch", false, "26.04.2023", Priority.LOW, animal7, taskType5);
        taskServices.saveTask(task5);
        Task task6 = new Task("cuddle time", false, "26.04.2023", Priority.LOW, animal4, taskType5);
        taskServices.saveTask(task6);
        Task task7 = new Task("administer medication", false, "26.04.2023", Priority.LOW, animal5, taskType3);
        taskServices.saveTask(task7);
        Task task8 = new Task("snack time", false, "26.04.2023", Priority.LOW, animal2, taskType1);
        taskServices.saveTask(task8);
        Task task9 = new Task("clean tank", false, "26.04.2023", Priority.LOW, animal8, taskType7);
        taskServices.saveTask(task9);
        Task task10 = new Task("take to the vet", false, "26.04.2023", Priority.LOW, animal3, taskType8);
        taskServices.saveTask(task10);
    }
}
