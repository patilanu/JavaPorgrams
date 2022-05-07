package com.self.inheritance;

interface A{
    void show();
    void disp();
}
interface B{
    void show();
}

public class MultipleInterface implements A,B{
    @Override
    public void show() {
        System.out.println("Interface of A & B");
    }
    @Override
    public void disp() {

        System.out.println("Method of Interface A");
    }

    public static void main(String[] args){
        MultipleInterface m = new MultipleInterface();
        m.show();
        m.disp();
    }
}
