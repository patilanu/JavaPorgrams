package ExceptionHandling;

import java.util.Random;

public class ArrayOutOfBound {
    public static void main(String[] args){
        Random r = new Random();
        //String[] array = {"a","b","c","d","e"};
        int a[] = new int[10];

        for(int i = 0 ; i < a.length; i++) {
            a[i] = r.nextInt(10);
        }
            try {
                System.out.println(a[20]);

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index Out Of Bond Exception ...");
            }
        for(int i : a)   //for Each loop
            // assigning each value iteratively to the variable
            System.out.println(i);
    }
}
