package ExceptionHandling;

class Vote{
    public static void validate(int age){
        if(age < 18){
           // System.out.println("Not Eligible for voting..");
            throw new ArithmeticException("Not Eligible for voting..");
        }
        else{
            System.out.println("Eligible for voting..");
        }
    }
}
public class ThrowKeywordExample {
    public static void main(String[] args){
       // Vote v = new Vote();
        Vote.validate(12);
    }
}
