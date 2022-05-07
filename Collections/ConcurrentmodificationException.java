package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class ConcurrentmodificationException {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(126);
        list.add(234);
        list.add(112);
        list.add(213);
       // System.out.println(list);
     /*   for (Integer i: list
             ) {
            System.out.println(i);
            list.add(99);
        }*/
      //  List<Integer> phones = list.stream().collect(Collector.toSet());
        Collections.sort(list);
    }
}
