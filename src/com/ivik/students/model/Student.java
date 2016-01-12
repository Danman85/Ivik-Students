package com.ivik.students.model;

public class Student {

    private String name;
    private double score;

    public Student(String name, double score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public double getScore(){
        return this.score;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setScore(double score){
        this.score = score;
    }
}
