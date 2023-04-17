package com.bootcoding.java.oops.exercise4;

public class Printpaper {

    String  Type;
    double cost;
    String use;
    String brand;

    public void tearPaper(int pieces){
        System.out.println("I have tore paper into " + pieces + " pieces");
    }

    public void throwPaper(){
        System.out.println("Paper fekla ka.... Arrr!");
    }

    public static void main(String[] args) {
        Printpaper pp = new Printpaper();
        pp.brand ="navnit";
        pp.cost = 10.05;
        pp.Type ="A4";
        pp.use = "printing";

        System.out.println("pp.cost = "+pp.cost);
        pp.tearPaper(5);
        pp.throwPaper();
    }

}
