package Encapsulation;

class StaticDemo{
   // int age;
    static int age;
}
public class Person {
   public static void main(String[] args){
       StaticDemo sd = new StaticDemo();
       //sd.age = 10;
       sd.age = 20;
       StaticDemo sd1 = new StaticDemo();
       sd1.age = 40;

       StaticDemo.age = 55;
       System.out.println("Age is :" +sd.age);
       System.out.println("Second Age is :" +sd1.age);
   }
}

