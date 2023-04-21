package com.bootcoding.java.oops.exercise7;

import java.util.Random;

public class BACapplication {
    private static long generateAccountid;

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.name = " State bank of India";
        ba.balance = 100000.00;
        ba.accountid = generateAccountid();

//        System.out.println(ba.name + " = Bank name ");
//        System.out.println(ba.balance + " = Bank balance");
//        System.out.println(ba.accountid + " = Bank account id");

        Customer customer = new Customer();
        customer.name ="Sharayu";
        customer.city ="Nagpur";
        customer.emailid = "sharayu06@gmail.com";
        customer.phone = 9922421310L;
        customer.bankAccount = ba;

//        System.out.println(customer.name + " = Customer name");
//        System.out.println(customer.city + " = Customer city");
//        System.out.println(customer.emailid + " = Customer email id");
//        System.out.println(customer.phone + " = Customer phone");

    }

    private static long generateAccountid() {
        Random random = new Random();
        int min = 100000;
        return  min + random.nextInt(10000000 - min);
    }
}
