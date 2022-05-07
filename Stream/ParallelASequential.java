package Stream;

import java.util.Arrays;
import java.util.List;

public class ParallelASequential {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Anuja","Sanjay","Patil","Nanded");
        list.stream()
                .parallel()
               // .forEachOrdered(System.out::println);
                .forEach(System.out::println);
    }
}
