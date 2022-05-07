package idea;


class Modifier1 extends Modifiers {
    void print1() {
        System.out.println("Public String from Parent :" +name);
        System.out.println("Protected String from Parent :" +pwd);
        System.out.println("Default Integer from Parent :" +a);
    }
}
public class AccessModifier {

    public static void main(String[] args) {
        /*
        Modifiers m = new Modifiers();
        System.out.println(m.name);
       // System.out.println(m.userName); // display error because private modifier
        System.out.println(m.pwd);
        System.out.println(m.a);  //default modifier
        */

        Modifier1 m1 = new Modifier1();
        System.out.println(m1.name);
        System.out.println(m1.pwd);
        System.out.println(m1.a);
        m1.print1();
    }
}
