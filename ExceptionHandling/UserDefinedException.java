package ExceptionHandling;

class User extends Exception {
    public User(String s){
        super(s);  //calling super class constructor
        //System.out.println("String is : " +s);
    }
}
public class UserDefinedException  {

    public static void main(String[] args){

       // User u = new User("Anuja");

        try {
            //User u = new User("Anuja");
            throw new User("Anuja");

        } catch (User u) {
            System.out.println("Catch block ... ");
           // System.out.println(u.getMessage());
            //u.printStackTrace();
        }

    }
}
