package com.training.inheritance;

class Fruit{
    public void AnyFruit(){
        System.out.println("Fruit Class..");
    }
}
class Apple extends Fruit{
    @Override
    public void AnyFruit() {

        System.out.println("Apple class..");
        super.AnyFruit();
    }
}
class Table{
    public void Foo(){
        System.out.println("Foo() method ..");
    }
}
class Room extends Table{
    Table t = new Table();
   //t.Foo();
}
public class IsRelationship {
    public static void main(String[] args){
        //Fruit f = new Fruit();
        //f.AnyFruit();
        Apple a = new Apple();
        a.AnyFruit();

        Room r = new Room();
        r.Foo();
    }
}
