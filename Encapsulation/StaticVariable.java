package Encapsulation;

class StaticComponent{
    static int staticVariable;
    static{
        System.out.println("StaticComponent SIB");
        staticVariable =10;
    }
    static void staticMethod(){
        System.out.println("From static Component :");
        System.out.println(staticVariable);
    }
}

public class StaticVariable {
    static {
        System.out.println("Main Class SIB ..");
    }
    public static void main(String[] args){
        StaticComponent.staticVariable=30;
        StaticComponent.staticMethod();
    }
}
