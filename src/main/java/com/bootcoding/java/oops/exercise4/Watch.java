package com.bootcoding.java.oops.exercise4;

public class Watch {
    String type;
    String color;
    double price;
    String brand;
    boolean smartwatch;

    public void isWorking(){
        System.out.println("No. Cell lekar aaoo!");
    }
    public void changeTime(){
        System.out.println("Changed Time of Watch!...");
    }


    public static void main(String[] args) {
        Watch w1 = new Watch();
        Watch w2 = new Watch();

        w1.brand = " fastrack";
        w1.type= " wrist";
        w1.color = " copper";
        w1.price = 4000.00;
        w1.smartwatch = true;

        w2.price = 2000.00;
        w2.smartwatch = false;
        w2.type = "wall";
        w2.color = "black";
        w2.brand = "atlas";

        System.out.println(w1.brand );
        System.out.println(w2.brand );
        w1.isWorking();
        w1.isWorking();
    }
}
