package com.example.Cat_CheckList_BackEnd_GroupProject.models;

public class TaskDTO {

    private String content;
    private boolean isCompleted;
    private String dueDate;
    private Priority priority;
    private Long catId;
    private Long taskTypeId;

    public TaskDTO(String content, boolean isCompleted, String dueDate, Priority priority , Long catId , Long taskTypeId){
        this.content = content;
        this.isCompleted = isCompleted;
        this.dueDate = dueDate;
        this.priority = priority;
        this.catId = catId;
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

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Long getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(Long taskTypeId) {
        this.taskTypeId = taskTypeId;
    }
}

