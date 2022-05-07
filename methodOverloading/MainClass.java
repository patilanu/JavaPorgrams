package methodOverloading;

import com.company.Main;

public class MainClass {

    void method(int a) {
        System.out.println(8);
    }
    void method (int [] a){
        System.out.println(2);
    }
    public static void main(String[] args){
        MainClass m = new MainClass();
        m.method(10);
       // System.out.println(10);
        m.method(Integer.parseInt("123"));
    }
}
