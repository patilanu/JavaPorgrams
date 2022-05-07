package ExceptionHandling;

import java.io.*;

public class ThrowsKeywordExample {

        public static void fileReader() throws FileNotFoundException,RuntimeException
        {
            FileReader file = new FileReader("C:\\Users\\SFS\\Desktop\\JAVA\\Test.txt");
            BufferedReader B = new BufferedReader(file);

            throw new FileNotFoundException();
        }

        public static void main(String[] args) throws Exception {

            fileReader();
            System.out.println("Rest of the code...");
        }
    }

