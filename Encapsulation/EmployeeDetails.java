package Encapsulation;

public class EmployeeDetails  {
    public static void main(String[] args){

    Employee emp = new Employee();
    emp.setFirstName("ANuja");
    emp.setLastName("Patil");
    emp.setCity("Mumbai");
    System.out.println("First Name : "+emp.getFirstName()+"\nLast name : " +emp.getLastName()+ "\nCity :"+emp.getCity());

    Employee sneha = new Employee();
        sneha.setFirstName("Sneha");
        sneha.setLastName("Yedne");
        sneha.setCity("MP");
        System.out.println("First Name : "+sneha.getFirstName()+"\nLast name : " +sneha.getLastName()+ "\nCity :"+sneha.getCity());
    }

}