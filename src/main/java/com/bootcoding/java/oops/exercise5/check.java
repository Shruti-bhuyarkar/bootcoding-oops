package com.bootcoding.java.oops.exercise5;

public class check {
    public static void main(String[] args) {

        Remote r = new Remote("dakin", "blue", 105);
        System.out.println(check.getRemoteExpense(r));
    }
    public static String getRemoteExpense(Remote remote){
        if(remote.price > 120){
            return "Expensive";
          //  System.out.println(" Remote is Expensive");
        } else if (remote.price > 100 && remote.price < 120 ) {
            return "Affordable";
            //System.out.println("Remote is Affordable");
        }
        else{
            return  "Cheaper";
            //System.out.println("Remote is Cheaper");
        }

    }

}
