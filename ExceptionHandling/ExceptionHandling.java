package ExceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionHandling  {

    void Throw1() {

        try {
            throw new FileNotFoundException();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ExceptionHandling e1 = new ExceptionHandling();
        e1.Throw1();
    }
}
