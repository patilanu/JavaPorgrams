package Stream;

import java.util.ArrayList;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("David");
        list.add("Johnson");
        list.add("Samontika");
        list.add("Brijesh");
        list.add("John");

       /*List<String> tempList = new ArrayList<>();
        for (String str : list) {
            if(str.startsWith("J"))
            {
                tempList.add(str);
            }

        }
        System.out.println(tempList);*/

        list.stream().filter((String str) -> str.startsWith("J")).forEach(System.out::println);
                //names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);


    }

}
