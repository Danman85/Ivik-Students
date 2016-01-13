package com.ivik.students.util;

import com.ivik.students.model.Student;

public class SortUtils{

    static boolean sorted = false;

    public static void sortStudents(Student[] students){

        Student[] temp;

        Student alleen = new Student("placeholder", 23.4);
        temp = new Student[]{alleen};

        while (sorted = false) {
            sorted = true;
            for (int n = 0; n < students.length; n++) {
                if (students[n].getScore() < students[n + 1].getScore()) {
                    temp[0] = students[n+1];
                    students[n+1] = students[n];
                    students[n] = temp[0];
                    sorted = false;
                }
            }
        }
    }
}
