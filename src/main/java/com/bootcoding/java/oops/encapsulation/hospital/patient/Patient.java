package com.bootcoding.java.oops.encapsulation.hospital.patient;

import java.util.Date;

public class Patient {
    private  String disease;
    public String name;
   public Date dateOfAdmission;
   public Date dischargeDate;
   // public  int age;

    public void print(){
        System.out.println("Name = "+name);
        System.out.println("Discharge date ="+dischargeDate);
        System.out.println("Disease ="+ disease);
       // System.out.println("Admission date ="+ dateOfAdmission);
    }

}
