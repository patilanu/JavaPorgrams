package com.company;


class A1{
        String name;
        int i;
        A1(){

            System.out.println("Default Constructor of Class A");
        }
        A1(String name){

            System.out.println("Parametrized Constructor of Class A");
        }
    }


    class B1 extends A1{
        B1(){
            //super();
            System.out.println("Default Constructor of Class B");
        }
        B1(String name){
            this.name = name;
            System.out.println("Parametrized Constructor of Class B");
        }
        B1(int i, String name){
            this.i = i;
            this.name = name;
            System.out.println("multiple parameterized constructor of B1");
        }
    }


    class C1 extends B1{
        C1(){

            System.out.println("Default Constructor of Class C");
        }

        C1(String name){
            super(name);
            System.out.println("Parametrized Constructor of Class C");
        }
    }

public class Chaining {

        public static void main(String[] args){
            C1 c = new C1("Test");

          //  B1 c = new C1("anu");
        }

    }

