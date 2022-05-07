package Java8_Features;

class A {
    void show(){
        System.out.println("Class A");
    }
}
/*
class B extends A{
    void show(){
        System.out.println("Class B");
    }
}*/
public class AnonymousInnerClass {
    public static void main(String[] args){
        A a = new A(){
            void show() {
                System.out.println("Anonymous class..");
            }
        };
        a.show();
    }
}
