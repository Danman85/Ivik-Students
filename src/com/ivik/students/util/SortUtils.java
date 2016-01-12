package com.ivik.students.util;

import com.ivik.students.model.Student;

public class SortUtils{

    public static void sortStudents(Student[] students){

        String temp;
        double m;

        for(int n = 0; n <students.length-1; n++) {
            if (students[n].getScore() < students[n + 1].getScore()) {
                temp = students[n].getName();
                m = students[n].getScore();
                students[n].setName(students[n + 1].getName());
                students[n].setScore(students[n + 1].getScore());
                students[n + 1].setName(temp);
                students[n + 1].setScore(m);
                }
            }
    }
}
