package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlock {
    public static void main(String[] args){
        int i, j = 1, k = 0;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        i = 8 ;
        try{

            System.out.println("Enter Number : ");
            j = Integer.parseInt(b.readLine());
            k = i / j ;
            System.out.println("Output is : " +k);
            System.exit(0);

        }
        catch(IOException e){
            System.out.println("IO Error..");
        }
        catch (ArithmeticException a) {
            System.out.println("Arithmatic Exception...");
        }
        catch(Exception e1){
            System.out.println("Exception..");
        }
        finally {
            //Used for closing resources(connection)
            // all the necessary statements that need to be printed regardless of the exception occurs or not.
            System.out.println("Redundent Code..");
        }
    }

}
