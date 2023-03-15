package com.bootcoding.java.oops.exercise2;

public class app {
    public static void main(String[] args) {
        faculty faculty = new faculty();
        Projector projector1 = new Projector();
        Projector projector2 = new Projector();

        faculty.startProjector(projector1);
        faculty.stopProjector(projector2);

        Projector[] ps = new Projector[5];
        for(int i = 0; i<ps.length; i++){
            Projector p = new Projector();
            p.name = "Projector"+(i+1);
            ps[i] = p;

        }

        faculty.removeProjector(ps);


    }

}
