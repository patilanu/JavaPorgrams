package com.company;


//What will happen one concrete class extends another abstract class
interface TestInterface1{
    void interFaceAbc();
}
abstract class Test1{
    void abc(){
        System.out.println("Test1 abc() Method");
    }
    abstract void pqr();
}
class Test2 extends Test1 implements TestInterface1{
    void xyz() {
        System.out.println("Test2 xyz() method");
    }
    @Override
    void pqr() {
        System.out.println("Test2 pqr() method");
    }

    @Override
    public void interFaceAbc() {
        System.out.println("Test2 interfaceAbc method");
    }
}

public class DayFour1 {
    public static void main(String[] args){
      /* Test2 t = new Test2();
       t.interFaceAbc();
       t.xyz(); */
        //t.pqr();
      Test1 t1 = new Test2();
        t1.abc();

    }
}
