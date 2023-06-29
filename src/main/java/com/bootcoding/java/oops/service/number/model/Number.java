package com.bootcoding.java.oops.service.number.model;

public class Number {
    int num;
    String Even;
    String Prime;
    String Palindrome;
    String Armstrong;

    @Override
    public String toString() {
        return "Number{" +
                "num=" + num +
                ", Even='" + Even + '\'' +
                ", Prime='" + Prime + '\'' +
                ", Palindrome='" + Palindrome + '\'' +
                ", Armstrong='" + Armstrong + '\'' +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getEven() {
        return Even;
    }

    public void setEven(String even) {
        Even = even;
    }

   public String getPrime() {
        return Prime;
    }

    public void setPrime(String prime) {
        Prime = prime;
    }

    public String getPalindrome() {
        return Palindrome;
    }

    public void setPalindrome(String palindrome) {
        Palindrome = palindrome;
    }

    public String getArmstrong() {
        return Armstrong;
    }

    public void setArmstrong(String armstrong) {
        Armstrong = armstrong;
    }
}
