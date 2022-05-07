package com.self.inheritance;

abstract class AbstractClass{
    abstract void blow();

}
abstract class DummyAbstract extends AbstractClass{
    abstract void blow();
}
class ConcretClass extends DummyAbstract{
   /* void blow(){
        System.out.println("This is Concret class method..");
    }*/

    @Override
    void blow() {
        System.out.println("Concrete class method");
    }
}
public class MultipleAbstractInterface extends DummyAbstract implements A,B{

    @Override
    public void show() {

        System.out.println("Show() method..");
    }

    @Override
    public void disp() {

    }
    public static void main(String[] args){
        MultipleAbstractInterface a = new MultipleAbstractInterface();
        a.show();
        a.blow();
        ConcretClass c = new ConcretClass();
        c.blow();
    }

    @Override
    void blow() {
        System.out.println("Main method blow()");
    }
}
