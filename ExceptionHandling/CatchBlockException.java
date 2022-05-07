package ExceptionHandling;

public class CatchBlockException {
    public static void main(String[] args){
        try{
            int a[] = new int[3];
            for(int i = 0; i <= a.length; i ++ ){
                a[i] = 5 ;
            }
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Exception :" +a);
            try{
                int c = 20/0;
            }catch (ArithmeticException e){
                System.out.println("Arithmatic Exception" +e);
            }
        }
    }
}
