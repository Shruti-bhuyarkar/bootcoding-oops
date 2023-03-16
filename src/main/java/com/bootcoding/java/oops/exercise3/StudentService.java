package com.bootcoding.java.oops.exercise3;

public class StudentService {
    public Student[] getStudent(Student[] students, float criteriaofper){
        int count =0;
        Student[] s = new  Student[10];
        for(int i=1; i<students.length; i++){
            if(students[i].percentage >criteriaofper){
               s[count++] = students[i];
            }
        }
        return s;
    }
}
