package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExample {

        @Override
        public String toString() {
            return "ArrayListExample{}";
        }

        public static void main(String[] args){

            ArrayList<Integer> list = new ArrayList<>(1000);
            list.add(10);   //0
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);

            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);
            list.add(123);
            list.add(124);
            list.add(10);    //45
            list.add(46, 202); //46
            list.add(123);   //46
            list.add(1244);  //47


            HashMap<MapExample, Integer> map =  new HashMap<>();
            MapExample key1 = new MapExample();
            MapExample key2 = new MapExample();
            MapExample key3 = new MapExample();
            MapExample key4 = new MapExample();
            MapExample key5 = new MapExample();
            map.put(key1, 12);
            map.put(key2, 13);
            map.put(key3, 14);
            map.put(key4, 15);
            map.put(key5, 16);

            System.out.println("Using equals "+ key1.equals(key2)); //false
            int s1 = key1.hashCode();
            int s2 = key2.hashCode();

            System.out.println("test "+ Integer.toString(s1).equals(Integer.toString(s2)));


            System.out.println("HashCode of key1 is:  "+ key1.hashCode() +
                    "\n HashCode of key2 is: "+key2.hashCode());   //same hash code value

        /*for(ArrayListExample key : map.keySet()){
            System.out.println("Hash code of keys is  "+key.hashCode());

        }
*/

        /*System.out.println("Get value from Map  "+map.get(key1));
        System.out.println("Get value from Map  "+map.get(key2));
        System.out.println("Get value from Map  "+map.get(key3));
        System.out.println("Get value from Map  "+map.get(key4));
        System.out.println("Get value from Map  "+map.get(key5));
*/
        }

        @Override
        public int hashCode(){
            return 10;
        }

    }
