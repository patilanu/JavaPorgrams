package Stream;

import java.util.ArrayList;
import java.util.List;

public class MethodStream {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("John");


        list.add("Paul");
        list.add("Jockey");
        list.add("Leo");
        list.add("Marina");

        /*list.stream()
                .filter((String s) ->  s.length() > 5)
                .forEach(System.out::println);*/
        list.parallelStream()
                .forEach(System.out::println);
        list.stream()
                .sequential()
                .forEach(System.out::println);
    }
}
