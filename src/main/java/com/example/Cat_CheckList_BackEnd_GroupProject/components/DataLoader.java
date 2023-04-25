package com.example.Cat_CheckList_BackEnd_GroupProject.components;

import com.example.Cat_CheckList_BackEnd_GroupProject.models.Cat;
import com.example.Cat_CheckList_BackEnd_GroupProject.models.User;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.CatRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.TaskRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.repositories.UserRepository;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.CatServices;
import com.example.Cat_CheckList_BackEnd_GroupProject.services.TaskServices;
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
//    @Autowired
//    TaskServices taskServices;

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



    }

}
