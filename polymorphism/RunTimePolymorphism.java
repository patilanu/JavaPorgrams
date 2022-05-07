package polymorphism;

// Runtime polymrphism

class Language{
    void displayInfo(){
        System.out.println("Common language...");
    }
}
class Java extends Language{

    @Override
    void displayInfo() {
        System.out.println("Java Programming Language...");
    }
}
public class RunTimePolymorphism {

    public static void main(String[] args){
        Java j = new Java();
        j.displayInfo();        // Method override

        Language l = new Language();
        l.displayInfo();        // same time different behavior
    }
}
