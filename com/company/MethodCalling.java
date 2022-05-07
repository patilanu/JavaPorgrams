package com.company;

//Method Calling with parameter

class Device{
    void Test(String moile, String company){

        System.out.println("Mobile is : " +moile+ "\tCompany is :" +company);
    }
    void Suppos(){
        String s = "";
        int i =1;
        System.out.println("String is : "+s + "Integer is : " +i);
    }
}

public class MethodCalling {
    public static void main(String[] args){
        Device d = new Device();
        d.Test("Nord","OnePlus");
        d.Suppos();
    }
}
