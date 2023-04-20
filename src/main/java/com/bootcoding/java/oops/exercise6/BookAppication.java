package com.bootcoding.java.oops.exercise6;

public class BookAppication {
    public static void main(String[] args) {
        Auther auther = new Auther();
        auther.name = "BootCoding";
        auther.education ="B.tech CSE";
        auther.phone = 7888001880L;

        System.out.println(auther.name + " = Auther name");
        System.out.println(auther.education + " = Auther education");
        System.out.println(auther.phone + " = Auther phone ");

        Book book = new Book();
        book.title ="Backend developer - JAVA";
        book.publisher ="navneet";
        book.price = 500.00;
        book.auther = auther;

        System.out.println(book.title + " = Book title");
        System.out.println(book.publisher + " = Book publisher");
        System.out.println(book.price + " = Book price ");
        System.out.println(book.auther + " = Book auther");
    }
}
//class (customer , bank account )
//account = balace , account holder , account id
//customer = name , city , phone , email id