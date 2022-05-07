package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeDemo {
    public static void main(String[] args){
        Employee e1 = new Employee(1);
        Employee e2 = new Employee(1);

        Map<Employee, String> map = new HashMap<Employee,String>();
        map.put(e1,"Anuja");
        map.put(e2,"Anuja");
        System.out.println(map.size());   //2 allow duplicate value

        System.out.println(map.entrySet());

        //System.out.println("Shallow compair :" +(e1 == e2));   //memory addr of e1&e2
       // System.out.println("Deep Compair : " +(e1.equals(e2)));
       System.out.println("hashCode_Value : " +(e1.hashCode()));

        Integer i = new Integer(1);
        Integer i1 = new Integer(1);
        Map<Integer, String> map1 = new HashMap<Integer,String>();
        map1.put(i,"one");
        map1.put(i1,"two");
        System.out.println("Integer Object :"+ (map1.size()));    //1

    }
}
class Employee{
    int id;
    public Employee(int id){
        this.id = id;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {

       // return Objects.hash(id);
        return 1;
    }
*/
}
