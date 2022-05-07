package String;

public class ReverseString {
    public static void main(String[] args){
        String s = "String Reverse Operation";
        //Stores the reverse of given string
        String reverse = "";
        for(int i = s.length()-1; i >= 0; i-- ){
            reverse = reverse + s.charAt(i);

        }
        System.out.println("Original String : " +s);
        System.out.println("Reverse String : " +reverse);
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println("Reverse String :" +sb);

         */
    }
}
