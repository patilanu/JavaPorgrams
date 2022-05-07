package com.training.inheritance;
class Parent1{
    String name = "Sneha";
    int i = 10;
    void show(){
        System.out.println("String :" +name);
        System.out.println("Interger :" +i);
    }
}
class Child1 extends Parent1{
    void show(){
        System.out.println("Child Method");
    }
}
public class Casting {
    public static void main(String[] args){
        Parent1 p = new Parent1();
        System.out.println(p.name);
    }
}
