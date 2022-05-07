package Java8_Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorVScomparable {
    public static void main(String[] args){
        List<Laptop> lap = new ArrayList<>();
        lap.add(new Laptop("Dell", 16,800));
        lap.add(new Laptop("HP", 8,500));
        lap.add(new Laptop("Apple", 32,1200));
        lap.add(new Laptop("Acer", 12,200));

         //Collections.sort(lap);
        //System.out.println(lap);
        Comparator<Laptop> c = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop l1, Laptop l2) {
              if(l1.getPrice() > l2.getPrice())
                  return 1;
              else
                return -1;
            }
        };

       // Comparator<Laptop> c = (Laptop s1, Laptop s2) -> s1.getPrice()-s2.getPrice();

        Collections.sort(lap, c);

        for (Laptop l : lap){
            System.out.println(l);
        }
    }
}
