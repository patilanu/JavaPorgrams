package com.company;

//Calling Method with Different Parameter

class Book {
    void Test(String firstname, String lastname, int pincode, double percentage) {
        System.out.println("Name is : " +firstname+ "\tLastName is : " +lastname+ "\tPincode is :" +pincode+ "\tPercentage :" +percentage);

    }
}
public class MethodsWithparam {
    public static void main(String[] args){

        Book b = new Book();
        b.Test("Anuja","Patil",400708,12.6);
    }
}
