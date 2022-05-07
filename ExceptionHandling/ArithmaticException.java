package ExceptionHandling;

class InArithmatic{
    void division(int a, int b){
        //int c = a/b;
        System.out.println("This is method of division");
    }
}
public class ArithmaticException {
    public static void main(String[] args){

       // InArithmatic ia = new InArithmatic();
        //ia.division(10,0);     // Run time Arithmatic Exception

        int a= 100, b =0;
        try{
            int c = a/b;
            System.out.println(c);
        }catch(ArithmeticException ex){
            System.out.println("Can't Divide by Zero : " +ex);
            //ex.printStackTrace();
        }
        finally {

            System.out.println("finally : i execute always.");
        }
        System.out.println("Executed..");
    }
}
