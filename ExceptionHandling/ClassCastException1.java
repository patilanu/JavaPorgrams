package ExceptionHandling;

class Animal {
    void Lion(){
        System.out.println("This Is Lion : ");
    }
}
class PetAnimal extends Animal {
    @Override
    void Lion() {
        //super.Lion();
        System.out.println("Subclass Lion method :");
    }

    void Dog() {
        System.out.println("This is Dog :");
    }

}
public class ClassCastException1 {
    public static void main(String[] args) {
        try {
            Animal a = new Animal();
            Animal petAnimal = new PetAnimal();  //child object to parent obj

           // PetAnimal p = new Animal();  //Can't Convert to top class
            PetAnimal p = (PetAnimal) a;
            System.out.println("Try Block :");

        } catch (ClassCastException e) {
            System.out.println("Can't assign base class to super class : "+e);

            //System.out.println(e);
            //e.printStackTrace();
        }
    }
}