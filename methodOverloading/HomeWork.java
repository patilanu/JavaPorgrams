package methodOverloading;

class M{
    void calculate(int a, int b){
        System.out.println("Class M :");
    }
}
class N extends M{
    @Override
    void calculate(int a, int b) {
        //super.calculate(a, b);
        //System.out.println("Multiplication is :" +a*b);
        System.out.println("Class N :");
    }
}
class O extends N{
    @Override
    void calculate(int a, int b) {
       // super.calculate(a, b);
        System.out.println("Class O :");
    }
}
public class HomeWork {
    public static void main(String[] args){
        /*
        M m = new N();
        m.calculate(10,10);
        N n = (N) m;
        n.calculate(10,20);
        O o = (O) n;
        o.calculate(30,40); */

    }
}
