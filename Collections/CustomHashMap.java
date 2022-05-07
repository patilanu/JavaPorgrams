package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CustomHashMap {

    public static void main(String[] args){

        Emp e1 = new Emp(1,"Anuja1");
        Emp e2 = new Emp(2,"Anuja2");
        Emp e3 = new Emp(3,"Anuja3");
        Emp e4 = new Emp(4,"Anuja4");

        Map<Integer, Emp> map = new HashMap<Integer, Emp>(10,0.75F);

        //map.put(101, e1);
        //map.put(102, e2);
       // map.put(11,e1);
        map.put(e1.getEmpId(), e1);
        map.put(e1.getEmpId(), e1);
        map.put(e2.getEmpId(), e2);
        map.put(e3.getEmpId(), e3);
        map.put(e4.getEmpId(), e4);     //added employee obj to map
        map.put(e4.getEmpId(), e4);

        System.out.println(map.get((e1)));
        /*
        //to display emplyee object details

        Set<Map.Entry<Integer, Emp>> ent = map.entrySet();


        //travese through EntrySet object to get emp obj
        for (Map.Entry<Integer, Emp> e : ent){
            System.out.println(e.getKey());          //Fetch key whatever we inserted in hashMap line 19
            Emp emp = e.getValue();     //retuen employee object
            emp.display();
        } */

        Iterator<Integer> iterator = map.keySet().iterator();  //iterator contain all key
        while (iterator.hasNext()){       //each key we are iterating
        Emp emp = map.get(iterator.next());     //get the object
        emp.display();
        }

    }
}
