package com.company;


//What will happen one abstract class extends another abstract class
//(No need to implement first abstract class abstract methods
abstract class run{
    void Train(){
        System.out.println("Train Method()");
    }
    abstract void Battery();
}
abstract class bus extends run{
    void Brain(){
        System.out.println("Brain method()");
    }
}
class Play extends bus{


    @Override
    void Battery() {

    }
}
public class DayFour3 {
    public static void main (String[] args){
       Play p = new Play();
       p.Train();
    }
}
