package com.company;

 abstract class Test5 {

    void t1()
    {

        System.out.println("super");
    }
}
class Concret extends Test5{
    void t1()
    {
       // super.t1();         //call super clss method then subclass
        System.out.println("child");

    }
    void t2()
    {
        System.out.println("child2");

    }
}
public class DayFour2 {
    public static void main(String[] args) {
        Test5 t=new Concret();
        t.t1();
       // t.t1();   //Method override
    }

}
