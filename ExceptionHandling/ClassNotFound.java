package ExceptionHandling;

public class ClassNotFound {
    public static void main(String[] args){

    try{
        Class.forName("ExceptionHandling.ArrayOutOfBound1");
      /*  Class c = Class.forName("java.lang.ClassLoader");
        System.out.println("Name" +c.getName());
        System.out.println("Package" +c.getPackage());*/

    }catch(ClassNotFoundException n){
        n.printStackTrace();
        //System.out.println("Catch Block...");
    }
    }
}
