package String;

public class StringProgram {
    public static void main(String[] args){
        String s = "ABCDE";
        String s1 = "ABCDE";
        String s2 = "abcde";

        System.out.println(s == s1); //true
        System.out.println(s2 == s1); //false

        String s3 = new String("JAVA");
        String s4 = new String("JAVA");
        String s5 = "JAVA";
        // based on their physical address
        System.out.println(s3==s4);             // false

        // based on their contents
        System.out.println(s3.equals(s4));      //true
        boolean test = s3.hashCode() == s5.hashCode();
        System.out.println("Comparing HashCode++" +test);   //true

        s3= s3+ "J2EE";
        System.out.println(s3);
        System.out.println(s3.equals(s4));     // false
    }
}
