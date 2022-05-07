package methodOverloading;

class A{

}
class B extends A{

}
class C extends B{

}

public class MethodOverLoadingClass {
    static void overloadMethod(A a){
        System.out.println("ONE");
    }
    static void overloadMethod(B b){
        System.out.println("Two");
    }
    static void overloadMethod(Object o){
        System.out.println("Three");
    }
    public static void main(String[] args){
        C c = new C();
        overloadMethod(c);
       // B b = new B();
       // overloadMethod(b);
        A a = new A();
        overloadMethod(a);
    }
}
