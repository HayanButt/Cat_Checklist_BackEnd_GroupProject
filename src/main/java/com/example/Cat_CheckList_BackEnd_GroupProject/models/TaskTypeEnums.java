package com.example.Cat_CheckList_BackEnd_GroupProject.models;

public enum TaskTypeEnums {

     FEEDING("F"),
     GROOMING("G"),
     MEDICATION("ME"),

     WATER("W"),
     PLAYTIME("P"),
     LITTERBOX("L"),
     MAINTENANCE("MA"),
     VETENARYCARE("V");

        private String abbreviation;

        TaskTypeEnums(String abbreviation){
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation(){
            return this.abbreviation;
        }



}
