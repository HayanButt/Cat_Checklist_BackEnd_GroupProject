# Cat_Checklist_BackEnd_GroupProject

## Project Theme

Our project theme initially began as a Cat Task Manager API but became an Animal Task Manager API. Although a regular to-do-list can suffice by using our
API you can manage your pets daily tasks with a stressfree mind. This project was inspired by Alex having to keep up with his multiple pets.

## API Description

The API allows the user to login and input their animals as well as the tasks associated with each pet.  

### User:
This represents a class which enables users to be added and managed within the database. The user can also have a list of animals.

### Animals:
This represents a class which enables the user to input their animal's name, birthday and the type of animal they own.

### AnimalType: 
This class represents the list of animals a user has put in as well as the available tasks for each animal type. 
For example, Tharahan owns a fish which has MAINTENANCE and FEEDING as the available tasks. 

### Task:
This class is where the user is able to input the description of the task, assign a due date, whether it is completed or not and priority (HIGH, MEDIUM, LOW)
for the animals.

### TaskType: 
This class contains the list of TaskTypeEnums which have been pre-listed for the user to select from.

## Relationships
There are 4 one to many relationships:
- One user to many Animals
- One AnimalType to many Animals
- One Animal to many Tasks
- One TaskType to many Tasks

## UML and ERD
![UML](https://user-images.githubusercontent.com/126498385/234849711-ce070932-bb02-4236-960c-da685652c6f8.png)







