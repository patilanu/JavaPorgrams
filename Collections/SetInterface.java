package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args){
        Set<String> s = new HashSet<String>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("A");

        // Printing elements of HashSet object
        System.out.println(s);
        String check = "Z";
        // Check if the above string exists in
        // the SortedSet or not
        // using contains() method
        System.out.println("Contains : " +check + " " +s.contains(check));

        // Iterating through the Set
        for(String value : s)
            System.out.println(value + ", ");
        System.out.println();

    }
}
