package Stream;

import Java8_Features.Laptop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            list.add(i);
        }
       // list.forEach(System.out::println);
       // list.stream().forEach(System.out::println);
        //list.parallelStream().forEach(System.out::println);
       /* System.out.println(list.stream().filter(i -> {
            System.out.println("hi");
            return true;
        }).findFirst());*/

        List<Integer> val = Arrays.asList(1,2,23,3,4,5,6);
        Stream<Integer> s = Stream.of(7,3,6,0,1,4,9);
        //Stream<Integer> s = val.stream();
        s.forEach(System.out::println);     //work
       // s.forEach(System.out::println);   //Exception

        List<Laptop> lap = new ArrayList<>();
        lap.add(new Laptop("Dell", 16,800));
        lap.add(new Laptop("HP", 8,500));
        lap.add(new Laptop("Apple", 32,1200));
        lap.add(new Laptop("Acer", 12,200));

        // List<Laptop> l = new ArrayList<>();

        lap.stream()
                .filter(machine -> machine.getPrice() > 800)
                .forEach(System.out::println);
        lap.stream()
                .map(Laptop::getRam);
        }
}
