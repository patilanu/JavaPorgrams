package Program_Practice;

import java.time.temporal.Temporal;

final class Employee{
    final String panNumber;

    Employee(String panNumber) {

        this.panNumber = panNumber;
    }
    public String getPanNumber(){
        return panNumber;
    }
}
public class CustomImmutableClass {
    public static void main(String[] args) {
        Employee e = new Employee("ABC123");
        String s = e.getPanNumber();
        System.out.println("PAN CARD : " +s);
    }
}
