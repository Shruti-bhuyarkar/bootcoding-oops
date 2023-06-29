package com.bootcoding.java.oops.inheritance.banner;

class Banner {
    String colour;
    String shape;
    String matter;
    String type;
    double price;
    double dimension;
    boolean lights;

     Banner(){
        System.out.println("Banner object is created");
    }
     public static void createBanner(){
          System.out.println("Banner has been created....");

    }
    public static void displayBanner(){
        System.out.println("Banner has been printed...");
    }
}
