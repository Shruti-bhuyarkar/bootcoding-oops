package com.bootcoding.java.oops.service.number.service;

import com.bootcoding.java.oops.service.number.model.Number;

public class PrimeNumService {
    public void primeNumber(Number number){

        for(int i = 2; i < number.getNum()/2; i++){
            if(number.getNum() % i == 0){
                number.setPrime("NOT PRIME NUMBER");
                return;
            }
        }
        number.setPrime("PRIME NUMBER");
    }

}
