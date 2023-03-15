package com.bootcoding.java.oops.exercise2;

public class faculty {
   public String name;

    public  void startProjector(Projector p) {
        System.out.println("The project is started" );

    }
    public void stopProjector(Projector projector2) {
        System.out.println("The projector is stoped");
    }
    public void removeProjector(Projector[] projectors){
        for(int i=0; i < projectors.length; i++){
            System.out.println("Removed " + projectors[i].name);
        }
    }


}
