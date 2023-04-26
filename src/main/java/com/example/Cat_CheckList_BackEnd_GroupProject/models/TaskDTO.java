package com.example.Cat_CheckList_BackEnd_GroupProject.models;

public class TaskDTO {

    private String content;
    private boolean isCompleted;
    private String dueDate;
    private Priority priority;
    private Long animalId;
    private Long taskTypeId;

    public TaskDTO(String content, boolean isCompleted, String dueDate, Priority priority , Long animalId , Long taskTypeId){
        this.content = content;
        this.isCompleted = isCompleted;
        this.dueDate = dueDate;
        this.priority = priority;
        this.animalId = animalId;
        this.taskTypeId = taskTypeId;
    }

    public TaskDTO(){

    }

//    SETTERS & GETTERS
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Long getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Long catId) {
        this.animalId = animalId;
    }

    public Long getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(Long taskTypeId) {
        this.taskTypeId = taskTypeId;
    }
}

