package Collections;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args){

       TreeMap<Integer, String > map = new TreeMap<>();
        //LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"Tom");
        map.put(21,"Peter");
        map.put(13,"Steve");
        map.put(45,"Robby");
        //System.out.println(map.get(2));
        System.out.println(map);

        map.forEach((k,v) -> System.out.println("key : "+k + "\tvalue : " +v));

        System.out.println(map.lastKey());
        System.out.println(map.firstKey());

        Set<Integer> lessThan20 = map.headMap(20).keySet();
        System.out.println(lessThan20);

        Set<Integer> greaterThan20 = map.tailMap(20).keySet();
        System.out.println(greaterThan20);

        TreeMap<String, Integer> UserMap = new TreeMap<>();
        UserMap.put("James", 100);
        UserMap.put("Brad", 11);
        UserMap.put("Albert", 300);
        UserMap.put("George", 99);
        UserMap.put("Larry", 199);
        UserMap.put("Ted", 999);
        UserMap.put("Poul", 50);
        //System.out.println(UserMap);
        UserMap.forEach((k,v) -> System.out.println("Key : " +k + "\tValue : " +v));

        //Descending order
        TreeMap<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());
        map1.put(12, "abc");
        map1.put(87, "abc");
        map1.put(65, "abc");
        System.out.println(map1);
    }
}
