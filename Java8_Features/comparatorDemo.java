package Java8_Features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class comparatorDemo {
    public static void main(String[] args){

        List<Integer> i = new ArrayList<>();
        i.add(110);
        i.add(784);
        i.add(106);
        i.add(617);
        i.add(983);
        //Comparator
        Collections.sort(i,(o1, o2) ->{
            return o1%10>o2%10?1:-1;
        });
        for(int a : i){
            System.out.println(a);
        }
    }
}
