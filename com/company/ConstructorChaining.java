package com.company;

class Village{
    Village(){
        System.out.println("Default Constructor of Village..");
    }
    String aName;
    Village(String name){
        this.aName = name;
        System.out.println("Parameterized Constructor of Village..");
    }
}
class College extends Village{
    College(){
        System.out.println("Default Constructor of College..");
    }
    String aName;
    College(String name){
        this.aName = name ;
        System.out.println("Parameterized Constructor of College..");
    }
}
class Tonnage extends College{
    Tonnage(){
        System.out.println("Default Constructor of Tonnage..");
    }
    String aName;
    Tonnage(String name){
        this.aName = name ;
        System.out.println("Parameterized Constructor of Tonnage..");
    }
}
public class ConstructorChaining {
    public static void main(String[] args){
    Tonnage t = new Tonnage("abc");
    }
}
