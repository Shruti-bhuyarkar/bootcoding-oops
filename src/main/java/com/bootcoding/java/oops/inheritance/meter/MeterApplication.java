package com.bootcoding.java.oops.inheritance.meter;

public class MeterApplication {
    public static void main(String[] args) {
        SinglePhase sp = new SinglePhase();
        sp.volts = 240;
        sp.type= "Single Phase meter";
        sp.create();
        sp.display();

    }
}

