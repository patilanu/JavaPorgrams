package methodOverloading;

class X{
    int method(int i, int d){
        return i+d;
    }
    static int method(int i, double d){
        return (int) (i+d);
    }
    double method(double i, int d){
        return i+d;
    }
    static double method(double i ,double d){
        return i+d;
    }
}
public class ProperOverloading {

    public static void main(String[] args){
        X x = new X();
       // x.method(10,10);
        System.out.println(x.method(10,10));
        System.out.println(X.method(12,10.0));
        System.out.println(x.method(2.0, 2.0));
    }
}
