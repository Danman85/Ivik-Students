package com.ivik.students.exam;

import com.ivik.students.model.Student;
import com.ivik.students.util.SortUtils;

public class StudentExamScores {

    public Student[] students;

    public StudentExamScores(){
        initExamScores();
    }

    private void initExamScores(){

        Student student1 = new Student("Bilbo", 111.1);
        Student student2 = new Student("Frodo", 33.3);
        Student student3 = new Student("Meriadoc", 66.4);
        Student student4 = new Student("Samwise", 58.3);
        Student student5 = new Student("Peregrin", 82.9);
        students = new Student[]{student1, student2, student3, student4, student5};
    }

    public void reportStudentScores(){
        SortUtils.sortStudents(students);
        System.out.printf("%-8s%-8s%n", "Name", " Score");
        System.out.printf("%-8s%8s%n", "--------", " -------");
        for(int n = 0; n < students.length; n++){
            System.out.printf("%-8s%8.2f%n", students[n].getName(), students[n].getScore());
        }
    }

    public static void main(String[] args){

        StudentExamScores test = new StudentExamScores();
        test.reportStudentScores();
    }
}


