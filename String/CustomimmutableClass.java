package String;

// How to create Custom Immutable class in Java?
//make class final
final class Employee{

    //fields should final
    private  String name;
    private  int empNo;

    Employee(String name, int empNo) {
        this.name = name;
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public int getEmpNo() {
        return empNo;
    }

}
public class CustomimmutableClass {
    public static void main(String[] args){
    Employee e = new Employee("anuja", 123);
        System.out.println(e.getName());
        System.out.println(e.getEmpNo());

        //e.empNo = 101;  (private field cant change)
    }
}
