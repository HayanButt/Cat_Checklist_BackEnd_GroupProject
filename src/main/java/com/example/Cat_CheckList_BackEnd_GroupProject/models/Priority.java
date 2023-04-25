package com.example.Cat_CheckList_BackEnd_GroupProject.models;

public enum Priority {

    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH");

    private String abbreviation;

    Priority(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation(){
        return this.abbreviation;
    }



}
