package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args){

        String s1 = "Anuja";
        String s2 = "Patil";
       // System.out.println("s1 : " +(s1.hashCode()) + "\ts2 : " +(s2.hashCode()));

        Map<String,Integer> map = new HashMap<>();
        map.put("abc", 1);
        map.put("pqr", 2);
        map.put("xyz", 3);
        map.put(s1, 4);
        map.put(s2, 5);

       // System.out.println("Size of Bucket is : " +(map.size()));
        Set<String> k = map.keySet();
        for(String i : k){
            System.out.println(i + " : " +map.get(i));
        }
        Set<Map.Entry<String,Integer>> val = map.entrySet();
        for(Map.Entry<String,Integer> e : val){
            System.out.println(e.getKey() + " : " +e.getValue());
            //e.setValue("III");
            e.setValue(111);
        }

    HashMap<String, String> m1 = new HashMap<>();
        m1.put(null,"123");
        m1.put(null,"1234");
        m1.put(null,"1235");
        m1.put(null,"123634");
       // System.out.println(m1.size());
        //System.out.println(m1.get(null));
       // HashMap<String, Integer> m2 = new HashMap<>();
        HashMap<HashMapDemo, Integer> m2 = new HashMap<>();
        HashMapDemo key1 = new HashMapDemo();
        HashMapDemo key2 = new HashMapDemo();
        HashMapDemo key3 = new HashMapDemo();

        m2.put(key1,12);
        m2.put(key2,13);
        m2.put(key3,14);
        //m2.put("key4",13);
        //m2.put("key3",14);
        //m2.put("key2",15);
       // System.out.println(m2.size());
        for(HashMapDemo key : m2.keySet()){
            System.out.println("HashCode of key :" +key.hashCode());
            System.out.println("get value from Map :" +map.get(key));
        }
    }

    @Override
    public int hashCode() {
        return 10;
    }
}
