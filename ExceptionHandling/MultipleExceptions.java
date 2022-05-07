package ExceptionHandling;

public class MultipleExceptions {
    public static void main(String[] args){
        try{
            int a = 10;
            int b =  5;
            System.out.println(a/b);

            int array[] = new int[3];
            for(int i = 0 ; i < array.length; i++){
                array[i] = 5;
                //System.out.println(array[i]);
            }
            MultipleExceptions obj = null;
            System.out.println(obj.toString());

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Exception Occurs" +e);
        }
       /* catch (ArrayIndexOutOfBoundsException e){
            System.out.println("IndexOutOfBound : " +e);
        }*/
    }
}
