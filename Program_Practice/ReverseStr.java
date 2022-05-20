package Program_Practice;

public class ReverseStr {
    public static void main(String[] args) {

    String s = "String Reverse Operation";
    //Stores the reverse of given string
    String reverse = "";
    int length =s.length();     //24
    //we will get last character at index 23

        for(int i = length-1; i >= 0; i-- ){
        reverse = reverse + s.charAt(i);
    }
        System.out.println(reverse);
    }
}
