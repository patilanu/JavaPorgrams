package com.self.inheritance;


class Parent {
    String baby = "Girl";
    void device(){
        System.out.println("Method of parent Class :");
        //System.out.println();
    }
}
class Child extends Parent {
    String city;
    void device(){
        System.out.println("Method of child Class :");
    }
}
public class UpDownCast {
    public static void main(String[] args){
        Parent p = new Child();
        p.device();         //Upcasting
                            // Method will override
        //p.baby = "Girl";
       // System.out.println(p.baby);



        //DownCasting implicitly
       Child c = (Child) new Parent(); //Run_Time error
        // c.device();

        //Explicitly
        Child c1 = (Child) p;

        c1.city = "mumbai";
        System.out.println(c1.city);
    }
}
