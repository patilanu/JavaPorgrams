package Program_Practice;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] arr1 = {3,10,6, 8,2};
        int[] arr2={9,4,22,1,44,23};

        int[] c = new int[arr1.length + arr2.length];


        for(int i = 0; i < arr1.length; i++){
            c[i] = arr1[i];
        }
        int len = arr1.length;

        for(int i = 0; i < arr2.length; i++){

            c[len] = arr2[i];
            len++;
        }

        for(int i = 0 ; i < c.length; i++) {
            System.out.println((c[i]));
        }
    }
}
