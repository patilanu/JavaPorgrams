package com.self.inheritance;

//Converting one data type into another
public class TypeCasting {
    public static void main(String[] args){

        int a = 20;
        long b = a;     //implicit casting from int to long data type
        double c = b;   // implicit casting from long to double data type

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    //can also covert int to double as follow
        int i = 200;
        double d1 = new Double(i);  //conversion using the instantiation
        double d2 = Double.valueOf(i); //conversion using the valueOf() method
       // System.out.println(d1);
        System.out.println(d2);

        System.out.println("****************************************************");
        System.out.println("Explicit typeCasting...");

        double d = 57.17;
        int p = (int)d;         // Explicit casting from long to int data type
        System.out.println(d);
        System.out.println(p);

        String s = "anu";

        int t = Integer.parseInt(s);  // converting string to int
    }
}
