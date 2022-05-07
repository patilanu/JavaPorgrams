package Collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("Mumbai");
        l.add("Pune");
        l.add("Banglor");
        // l.removeLast();
        l.addFirst("Nanded");
        l.add(1,"MP");
        //System.out.println(l);
        //HashMap<String,String> map = new HashMap<>();
        Vector<String> v = new Vector<>();

        for (String str : l) {  //multiple value iterate
            System.out.println(str);
        }
    }
}
