package com.company;

//How to call method with parameter and without parameter
class Test{
    void SimpleMethod(){

        System.out.println("Simple Method ....!");
    }
    void ParameterMethod(String name){

        System.out.println("Name is : "+name );
    }
    void MultipleParameter(){
        String name ="ABC";
        int number = 123;
        String addr = "Mumbai";
        System.out.println("My name is : " +name+ "\tNumber is : "+number+ "\tAddress is : " +addr);

    }
}
public class CallMethodWithParam {
    public static void main(String[] args){

        Test t = new Test();    //Creating Object in java
        t.SimpleMethod();
        t.ParameterMethod("Anuja");
       // System.out.println(t.MultipleParameter());  //Have question Here
        t.MultipleParameter();
    }
}
