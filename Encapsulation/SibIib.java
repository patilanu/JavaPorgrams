package Encapsulation;

class Method{
    void test(){
        System.out.println("test() Method : ");
        SibIib sb = new SibIib();
        sb.test1();
    }
    {
        System.out.println("IIB of Method Class..");
    }
    static {
        System.out.println("SIB of Method class ..");
    }
}
public class SibIib extends Method {
    public static void main(String[] args){
    Method m = new Method();
   // m.test();
    }
    void test1(){
        System.out.println("test1() from main ;");
    }
    {
        System.out.println("IIB of Main Class..");
    }
    static {
        System.out.println("SIB of Main Class..");
    }
}
