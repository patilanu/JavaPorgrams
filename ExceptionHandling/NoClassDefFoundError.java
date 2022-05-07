package ExceptionHandling;
class MyClass{
    void info(){
        System.out.println("Hello");
    }
}
public class NoClassDefFoundError {
    public static void main(String[] args){
    MyClass m = new MyClass();
    m.info();
    }
}
