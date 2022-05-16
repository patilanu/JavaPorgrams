package Stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static int transform(int number) // throws InterruptedException
     {
       System.out.println("Transform : " +number + " " +Thread.currentThread());
         try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         return number;
    }

    public static void printIt(int number) {

        System.out.println(number + " " + Thread.currentThread());
    }
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int result = 0;
        for(int e : list){
            if(e % 2 == 0){
                result += e * 2;
            }
        }
        System.out.println(result);

        //Collection pipeline
        System.out.println(
                list.stream()
                        .filter(e -> e % 2 == 0)
                        .mapToInt(e -> e * 2)
                        .sum()
        );
        /*list.stream()
                .parallel()
                .sequential()
                .map(ParallelStreamDemo :: transform)
                .forEach(System.out::println);
*/
        list.stream()
                .parallel()
                .map(ParallelStreamDemo :: transform)
                .forEachOrdered(ParallelStreamDemo :: printIt);
                //.filter(ParallelStreamDemo :: printIt);
       }

}
