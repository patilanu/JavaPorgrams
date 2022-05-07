package Java8_Features;

import java.util.ArrayList;
import java.util.List;

public class ExternalVSInternalIteration {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");

      /*  for (String item : list) {
            //External Iteration
            if(!item.equalsIgnoreCase("a1"))
            System.out.println(item);
        }
        */
        //internal iteration

        //list.forEach(item -> System.out.println(item));
        list.parallelStream().filter(item -> !item.equalsIgnoreCase("a1")).
                forEach(item -> System.out.println(item));
    }
}
