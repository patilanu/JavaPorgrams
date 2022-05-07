package Stream;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static boolean check(int number){
        System.out.println("Check :" +number + " " +Thread.currentThread());
        return true;
    }

    public static int add(int total,int e){
        int result = total + e;
        //System.out.println("total : " + total + ",\te :" +e + " \tresult:" +result);
        return result;
    }
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

       /* list.stream()
                .parallel()
                .filter(Sample :: check);  //for filtering take boolean
                //.map(Sample :: check)   //took integer return type*/
        System.out.println(
                list.stream()
                       // .parallel()   //Dont do when identity val 21
                        //.reduce(0,(total, e) -> add(total, e))   //ok to use parallel
                        .reduce(21, (total,e) -> add(total, e))
        );
    }
}
