package polymorphism;

//Compile Time Polymorphism
class Calculate{
    void area(int l, int b){
        System.out.println("Area of Rectangle : " +l*b);
    }
    void area(int a, int b, int c){
        System.out.println("area of Trangle : " +a*b*c);
    }
}
public class CompileTimePolymorphm {
    public static void main(String[] args){
        Calculate c = new Calculate();
        c.area(10,20);
        c.area(10,10,10);
    }
}
