package Collections;

import java.util.Objects;

public class Emp{
    private int empId;
    private String empName;

    public Emp(int empId, String empName){
        super();
        this.empId = empId;
        this.empName = empName;
    }
    public int getEmpId(){
        return empId;
    }
    public void setEmpId(){
        this.empId = empId;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(){
        this.empName = empName;
    }
    public void display(){
        System.out.println("Emp Id : " +getEmpId() + "\tEmp Name : " +getEmpName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return empId == emp.empId && Objects.equals(empName, emp.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName);
    }
}
