package Java8_Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person {
    private String name;

    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name = name;
    }

}
public class FunctionalInterfaceDemo {
    public static void main(String[] args){

        //1)Predicate -- boolean result
        Predicate<String> checkLength = str -> str.length()>5;
        //checking if length of string >5--true--else--false
        System.out.println(checkLength.test("abc"));

        //2)Consumer -- only consume data -- no output
        Person p  = new Person();
        Consumer<Person> setName = t -> t.setName("Play Java");
        setName.accept(p);
        System.out.println(p.getName());

        //3)Functional -- both i/p & o/p
        Function<Integer,String> getInt = t -> t*10 + " Data multiplied by 10";
        System.out.println(getInt.apply(2));

        //4)Supplier -- doesnt take arguments -- only o/p
        Supplier<Double> getRandomDouble = () -> Math.random();
        System.out.println(getRandomDouble.get());   //no o/p


    }
}
