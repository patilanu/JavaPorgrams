package Java8_Features;

interface InterfaceOne{
    default void anyMethod() {
        System.out.println("Hii... From Interface One");
    }
}
interface InterfaceTwo extends InterfaceOne {
    @Override
    default void anyMethod() {
        InterfaceOne.super.anyMethod();
        System.out.println("Hii... From Interface Two");
    }
}
class ClassOne implements InterfaceOne,InterfaceTwo{
    @Override
    public void anyMethod() {
       //InterfaceOne.super.anyMethod();
       System.out.println("Hii.. From Class One");
    }
}
public class DiamondProblemSolution extends ClassOne implements InterfaceOne,InterfaceTwo {
   /* @Override
    public void anyMethod() {
        InterfaceOne.super.anyMethod();
    }*/

    public static void main(String[] args){
        //1. select classes over interfaces
       new DiamondProblemSolution().anyMethod();  //ClassOne

        //2.select most specific interfaces than general interface

    }
}
