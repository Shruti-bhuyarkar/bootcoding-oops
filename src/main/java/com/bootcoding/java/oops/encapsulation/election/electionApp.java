package com.bootcoding.java.oops.encapsulation.election;

import java.util.Calendar;
import java.util.Date;

public class electionApp {
    public static void main(String[] args) {
        election cm = new election();
        cm.setCity("Nagpur");
        cm.setElectionDate(getNextDate(15));

        System.out.println(cm.getCity());
        System.out.println(cm.getElectionDate());

        candidate raju = new candidate();
        raju.setName("Bhola");
        raju.setAge(29);
        raju.setEducation("B.tech mechanical");

        System.out.println(raju.getName());
        System.out.println(raju.getAge());
        System.out.println(raju.getEducation());
    }

        private  static  Date getNextDate(int days){
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE , days * 15 );
            //System.out.println("Date = "+ cal.getTime());
            return cal.getTime();
        }

}
