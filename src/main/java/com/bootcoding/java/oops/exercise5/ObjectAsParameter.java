package com.bootcoding.java.oops.exercise5;

public class ObjectAsParameter {
    public static void main(String[] args) {
        Remote r  = new Remote("Videocon", "Gray", 55.00);

        ObjectAsParameter.isRemoteBlack(r);
    }

    //static - class
    //

    public static boolean isRemoteBlack(Remote remote){
        if(remote.color.equals("Black")){
            return true;
        }
        return false;
    }
}
