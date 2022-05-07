package methodOverloading;

class FisteMethod{
    void method(int i){
        System.out.println("ONE...");
    }
    void method(double d){
        System.out.println("TWO");
    }
}
class SecondMethod extends FisteMethod{
    @Override
    void method(double d) {
        System.out.println("THREE");
    }
}
public class SixthQuestion {
    public static void main(String[] args){
        new SecondMethod().method(100);
    }
}
