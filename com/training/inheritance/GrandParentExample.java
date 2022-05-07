package com.training.inheritance;

class GrandParent{

    void dummy(){
        System.out.println("Grand father don't want to share some property with the child.");
    }
    void house(){
        //We implement some crucial common functionality.
        //This functionality is required at multiple places.
        //We should put that code in parent class and then we can extend it at required places.
        System.out.println("Grand father created 2 story building.");
    }
}

class Parent extends GrandParent{

    void house(){
        System.out.println("Father created 4 story building.");
    }

    void newHouse(){
        System.out.println("Father created grand new building.");
    }
}

public class GrandParentExample {
    public static void main(String[] agrs) throws  ClassCastException{
        Parent parent = new Parent();
        //Here we have reference is of Parent Type.
        //And Actual Object type is of Parent.
        //parent.house();
        GrandParent grandParent = new GrandParent();
        GrandParent grandParent123 = new GrandParent();
        //Here we have reference is of GrandParent Type.
        //And Actual Object type is of GrandParent.
       // grandParent.house();
        System.out.println("Unique Id of grandParent Object is ."+grandParent.hashCode());
        System.out.println("Unique Id of grandParent123 Object is ."+grandParent123.hashCode());

        //Upcasting
        GrandParent grandParent1p = new Parent();
       // grandParent1p.dummy();
        System.out.println("Unique Id of grandParent1p Object is ."+grandParent1p.hashCode());
        //Natural casting
        //Here we have reference is of GrandParent Type.
        //And Actual Object type is of Parent.

        int age = 10000000;
        short sh = (short) age;
        String str = new String("");
        System.out.println("sh value is :"+sh);
        //Down casting
        Parent parent1 = (Parent) new GrandParent();


    }
}

class Uncle extends GrandParent{
    void newHouse1(){
        System.out.println("Father created grand new building.");
    }

    void test(){}

}