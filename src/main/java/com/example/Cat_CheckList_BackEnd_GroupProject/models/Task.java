package com.example.Cat_CheckList_BackEnd_GroupProject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column
    private String content;
    @Column
    private boolean isCompleted;
    @Column
    private String dueDate;
    @Column
    private Priority priority;

    @ManyToOne
    @JoinColumn(name = "cat_id")
    @JsonIgnoreProperties({"tasks"})
    private Cat cat;
    @ManyToOne
    @JoinColumn(name = "task_type_id")
    @JsonIgnoreProperties({"tasks"})
    private TaskType taskType;


    public Task(String content, boolean isCompleted, String dueDate, Priority priority , Cat cat , TaskType taskType){
        this.content = content;
        this.isCompleted = isCompleted;
        this.dueDate = dueDate;
        this.priority = priority;
        this.cat = cat;
        this.taskType = taskType;
    }

    public Task(){

    }

//    SETTERS & GETTERS


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }
}
