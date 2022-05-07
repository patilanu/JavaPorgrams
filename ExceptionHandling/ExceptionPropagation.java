package ExceptionHandling;

public class ExceptionPropagation extends Throwable {
    void m(){
        int data = 50/0;
        System.out.println("Data ;" +data);
    }
    void n(){
        m();
    }
    void p(){
        try {
            n();
        }catch(Exception e)
        {
            System.out.println("Exception Hadled....");
           // e.printStackTrace();
        }
    }
    public static void main(String[] args){
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.p();
        System.out.println("Normal Flow..");
    }
}
