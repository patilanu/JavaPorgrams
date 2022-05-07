package com.company;

//calling parameterized constructor from default constructor

class Laptop{
     Laptop(){
         System.out.println("Default Constructor of Laptop :");
     }
     Laptop(String keyboard, String mouse){
         System.out.println("Parameterized Constructor of Laptop :");
         System.out.println("KeyBoard is :" +keyboard+ "\tMouse is :" +mouse);
     }
}
class Machine extends Laptop{
    Machine(){
          //super();                         //Calling Default Constructor
        //super("ThinkPad","iBall");      //Calling Parameterized from Default

        System.out.println("Default Constructor of Machine :");
    }
    Machine(String voltage, String power){

        System.out.println("Parameterized Constructor of Machine :");
        System.out.println("Voltage Is : " +voltage+ "\t power is :" +power);
    }
}
public class CallingParamConstructor {
    public static void main(String[] args){
       //Machine m = new Machine();  //Calling Default constructor
         Machine a = new Machine("12amp","30watt"); // Calling Parameterized Constructor

    }
}
