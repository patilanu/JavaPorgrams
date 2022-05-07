package Collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

//--> vector --> Dynamic array
public class VectorClass {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();         //100%, Synchronized, slow, Threadsafe
        Hashtable<String, String> s = new Hashtable<>();
        ArrayList<Integer> a = new ArrayList<>();   //50%, Not ThreadSafe, fast

        //Vector v = new Vector();
        v.add(3);

        v.add(4);
        v.add(3);
        v.add(4);
        System.out.println("Capacity is : "+v.capacity());
        for (int i:v) {
            System.out.println(i);
        }
    }
}
