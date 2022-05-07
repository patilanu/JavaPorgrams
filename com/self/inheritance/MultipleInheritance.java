package com.self.inheritance;

class Animal{
    void tiger() {
        System.out.println("This is tiger...");
    }
    void system(){
        System.out.println("Super class Method ..");
    }
}
class PetAnimal extends Animal{
    void cat(){
        System.out.println("This is Cat...");
    }
    void system(){
        System.out.println("child Class method");
    }
}
class AnyAnimal extends PetAnimal{
    void dog(){
        System.out.println("This is Dog..");
    }
}
public class MultipleInheritance {

    public static void main(String[] args){
       Animal a = new PetAnimal();
        a.system();
        AnyAnimal  aa = new AnyAnimal();
        aa.system();

    }
}
