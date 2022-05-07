package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDuplicatKey {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("A", "a");
        //System.out.println(map);
       // System.out.println(map.get("b"));

        map.put(null,"abc");
        System.out.println(map.get(null));

       // String s = "Anuja";
        //String s1 = "Anuja";
        //System.out.println(+(s.hashCode())  +" \t" +(s1.hashCode()));
    }
}
