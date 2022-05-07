package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class JavaCollections {

    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();

        a.add("Anuja");
        a.add("Sneha");
        a.add("Sneha");
        Collections.sort(a);
        System.out.println(a);


        a.add("Shanay");
        System.out.println(a);   //add last in row
        a.add(1,"Ved");  //adds inbetween
        System.out.println(a);

        //a.remove(3);
        System.out.println(a);

        a.set(0,"Saee");   // replace
        System.out.println(a);

        ArrayList<Integer> b = new ArrayList<>();
        int c = 1;
        b.add(c);
        System.out.println(c);
    }
}
