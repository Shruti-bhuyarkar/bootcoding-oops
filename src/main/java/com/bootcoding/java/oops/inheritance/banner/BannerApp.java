package com.bootcoding.java.oops.inheritance.banner;

public class BannerApp {
    public static void main(String[] args) {
        FlexBanner fb = new FlexBanner();
        fb.matter="New batch of java is starting soon....";
        fb.colour="white";
        fb.dimension=15.2;
        fb.lights=false;
        fb.price=1500.0;
        fb.shape="rectangular";
        fb.type="Flex Banner";
        fb.createBanner();
        fb.displayBanner();

    }
}

//meter- volts,
//single phase
//meterApp