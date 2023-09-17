package com.bootcoding.java.oops.service.number;

import com.bootcoding.java.oops.service.number.model.Number;
import com.bootcoding.java.oops.service.number.service.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class NumberApp {
    public static void main(String[] args) throws IOException {
        ArmstrongService armstrongService = new ArmstrongService();
        EvenOddService evenOddService = new EvenOddService();
        NumberService numberService = new NumberService();
        PalindromeService palindromeService = new PalindromeService();
        PrimeNumService primeNumService = new PrimeNumService();
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/bootcoding/bootcoding-services/numbers.csv"));

        ArrayList<Number> numbers = new ArrayList<>();
        for(int i = 0; i < 1000; i++){
            Number randomNumber = numberService.getRandomNumber();
            evenOddService.checkEvenOdd(randomNumber);
            palindromeService.palindrome(randomNumber);
            primeNumService.primeNumber(randomNumber);
            numbers.add(randomNumber);
        }
    }
}
