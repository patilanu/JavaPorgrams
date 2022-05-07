package com.self.inheritance;

// How inheritance work ?
// parent class
class Nanded {
    void taluka(){
        System.out.println("Degloor is Small city in Nanded,Maha, and in India ");
    }
}
//Child class
class MhState extends Nanded {
    void marathWada(){
        System.out.println("Marathwad includes seven district :");
    }
}
class CountryIndia extends MhState{
    void state(){
        System.out.println("There are number of states in India : ");
    }
}

public class MyInheritance {
    public static void main(String[] args){

        Nanded nanded = new Nanded();
        nanded.taluka();
    }
}
