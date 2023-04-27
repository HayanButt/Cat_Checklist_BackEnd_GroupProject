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

![ERD](https://user-images.githubusercontent.com/126498385/234849953-0981fac0-65b0-426d-830a-0cea8afb75f6.png)

## Tech Stack
<ul>
<li>Intellij IDEA (JDK 17)</li>
<li>PostgreSQL</li>
<li>Spring Boot</li>
<li>Postico</li>
<li>Postman</li>
</ul>

## SetUp Instructions 
<ol>
<li>Ensure the following are installed on your machine:</li>
<ul>
<li>Intellij IDEA (JDK 17)</li>
<li>PostgreSQL</li>
<li>Spring Boot</li>
<li>Postico</li>
<li>Postman</li>
</ul>

<li> Clone the repository from GitHub. Scroll to the top of this page and click on the green Code button. Ensure SSH is selected and copy the link provided. In your terminal, perform the following command:
git clone git@github.com:Yasmin-H/Cat_Checklist_BackEnd_GroupProject.git</li>

<li> Create a new PostgreSQL database named 'Cat_Checklist' anywhere in your terminal.</li>
createdb Cat_Checklist

<li> Via Intellij IDEA, run the CatChecklistApiApplication and make sure the API is running on port 8080.</li>

<li> Via Postman, create a new collection called Animal Task Manager and add requests using the 'Postman Instructions' provided below.</li>
  
 ## PostMan Instructions 
  







