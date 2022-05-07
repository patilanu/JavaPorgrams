package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMethods {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");
        names.add("Johnson");
        names.add("Johnson");
        names.add("Johnson");

       // System.out.println(names);
        //names.stream().forEach(System.out::println);
        names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);


      //  System.out.println("\n");
       /*Set<String> setTest =  names.stream()
                .filter((String name) -> name.length() > 5)
                .collect(Collectors.toSet());

        setTest.forEach(System.out::println);*/

        System.out.println('j'+'a'+'v'+'a');


       OptionalInt result =  IntStream.of(4, 7, 1, 8, 3, 9, 7)
                .filter((int i) -> i > 5)
                .distinct().
                findFirst();

        //Normal Execution
        //names.stream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);
        //parallel Execution
        //names.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);

        //Selecting first 4 names
       // names.stream().limit(4).forEach(System.out::println);
        //Skipping first 4 names
        //names.stream().skip(4).forEach(System.out::println);
        //Returns length of each name
        //names.stream().map(String::length).forEach(System.out::println);

    }

}
