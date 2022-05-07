package Encapsulation;

class Counter {
    //int counter;
    static int counter;
    Counter() {
        counter++;
        System.out.println("Current value of counter is :" +counter);
    }
    static void note(){
        System.out.println("Static method : ");
    }
}
public class CouterVariable {
    public static void main(String[] args){
       /* Counter c = new Counter();
        Counter c1 = new Counter();
        Counter c2 = new Counter(); */
        Counter.counter++;
        Counter.counter++;
        Counter.counter++;
        System.out.println(Counter.counter++);

        Counter.note();
    }
}
