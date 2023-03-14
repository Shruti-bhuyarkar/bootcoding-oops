package com.bootcoding.java.oops.exercise1;

public class StudentApp {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Student s = new Student();
            s.rollno = i;
            s.Name = "shruti" + i;
            s.Address = "Nagpur ";
            s.Percentage = 85 + i;
            s.print();

            GradeSystem gs = new GradeSystem();
            char grade = gs.findGrade(s);
            System.out.println(grade);
        }

    }
}

