package Program_Practice;

public class StringRvsUsingRecursion {
    // Recursive method to reverse given character array
    private static void reverse(char[] A, int l, int h){
        if(l < h){
            char ch = A[l];
            A[l] = A[h];
            A[h] = ch;
            reverse(A, l+1, h-1);
        }
    }
    // Recursive method to reverse a string in Java
    public static String reverse(String s){
        if(s == null || s.equals("")){
            return s;
        }
        // convert string into a character array
        char[] A = s.toCharArray();
        // reverse character array
        reverse(A, 0, A.length - 1);
        // convert character array into the string
        return String.copyValueOf(A);
    }
    public static void main(String[] args) {
        String s = "String Reverse";
        s = reverse(s);
        System.out.println(s);
    }
}
