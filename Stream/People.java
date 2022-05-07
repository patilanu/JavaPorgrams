package Stream;

import java.util.Arrays;
import java.util.List;

public class People {
    public static List<Person> createPeople() {
        return Arrays.asList(
                new Person("Sara", Gender.FEMALE, 20),
                new Person("Sara", Gender.FEMALE, 22),
                new Person("Bob", Gender.MALE, 20),
                new Person("Paula", Gender.FEMALE, 32),
                new Person("Paul", Gender.MALE, 32),
                new Person("Jack", Gender.MALE, 2),
                new Person("Jack", Gender.MALE, 72),
                new Person("Jill", Gender.FEMALE, 12)
        );
    }
    public static void main(String[] args){
        //find the name in upperCase of the first  female older than 30
        System.out.println(
        createPeople()
                .stream()
                .parallel()
                .filter(person -> person.getGender() == Gender.FEMALE)
                .filter(person -> person.getAge() >30)
                .map(Person::getName)
                .map(String :: toUpperCase)
                .findFirst()
                .orElse("No One")
                );
        //stream 1.8
        //It doesnt execute a function an a collection of data
        //it instead executes collection of functions on a piece of data
    }
}
