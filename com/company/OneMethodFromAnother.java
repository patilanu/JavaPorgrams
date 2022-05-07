package com.company;

class City{
    void Test(){
        System.out.println("First Method...");
        Test2();
    }
    void Test2(){
        System.out.println("Second Method...");
    }
        }
class Cup{
    void Best(){
        String school = "ABC";
        String student = "Ved";
        int std = 5;
        System.out.println("School is ;" +school+ "\tStudent is :" +student+ "\tStandard is:"+std);
        Best1();
    }
    void Best1(){
        String book = "Investment";
        String author = "WarrenBuffett";
        System.out.println("Book Name is : " +book+ "\t Author is :" +author);
    }
}
public class OneMethodFromAnother {
    public static void main(String[] args){
        City c = new City();
        c.Test();            //Calling One Method From Another

        Cup c1 = new Cup();         //Calling Parameterized method one-to-another
        c1.Best();
    }
}
