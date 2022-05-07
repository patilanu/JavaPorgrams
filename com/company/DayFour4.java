package com.company;

// One concrete class extends another concrete class
class Glass{
    void Steel(){
        System.out.println("Steel method : ");
    }
}
class Plate extends Glass{
    void German(){
        System.out.println("german method :");
    }
}
public class DayFour4 {
    public static void main(String[] args){
       // Plate p = new Plate();
        Plate p = (Plate) new Glass();
        p.Steel();
    }
}
