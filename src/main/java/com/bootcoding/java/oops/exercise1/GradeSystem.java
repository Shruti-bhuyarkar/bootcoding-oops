package com.bootcoding.java.oops.exercise1;

public class GradeSystem {
    public char findGrade(Student std){
        if(std.Percentage > 90){
            return 'A';
        } else if (std.Percentage>80) {
            return 'B';
        }
        return 'C';
    }
}

