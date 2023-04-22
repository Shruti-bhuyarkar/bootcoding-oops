package com.bootcoding.java.oops.encapsulation.hospital;

import com.bootcoding.java.oops.encapsulation.hospital.patient.Patient;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class HospitalApplication {
    public static void main(String[] args) {
        Patient tom = new Patient();
        tom.name = "jerry";
        tom.dateOfAdmission = getNextDate(7);
        tom.dischargeDate = new Date();
        tom.print();

        Hospital care = new Hospital();
        care.setName("Care");
        care.setName("Nagpur");
        care.setServices("Multispeciality hospital");
        care.setId(UUID.randomUUID());

        System.out.println(care.getName());
        System.out.println(care.getAddress());
        System.out.println(care.getServices());
        System.out.println(care.getId());
    }
    private  static  Date getNextDate(int days){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE , days * -1);
        System.out.println("Date = "+ cal.getTime());
        return cal.getTime();
    }
}