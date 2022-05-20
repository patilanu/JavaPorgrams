package Program_Practice;

public class StringCount {
    public static void main(String[] args) {
        String s = "I am Best";
        int count = 0 ;
        //count each char except space
        for (int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) != ' ')
                count++;
        }
        System.out.println("Count : " +count);
    }
}
