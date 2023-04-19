package com.bootcoding.java.oops.exercise4;

public class Switch {
    String type;
    double price;
    String color;
    String material;



    public static void main(String[] args) {
        Switch s1 = new Switch();
        Switch s2 = new Switch();

        s1.color = "white";
        s1.material = "fiber";
        s1.price = 500;
        s1.type = "low power";

        s2.color= "black";
        s2.type = "high power";
        s2.material = "plastic";
        s2.price = 250;

        System.out.println("s1.type =" + s1.type);
        System.out.println(s2.type);


    }
    public Switch(){
        System.out.println("Switch is created");
    }
}
