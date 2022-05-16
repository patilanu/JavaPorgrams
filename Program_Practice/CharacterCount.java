package Program_Practice;

public class CharacterCount {
    static final int MAX_CHAR = 256;
    static void getOccuringChar(String s){
        // Create an array of size 256 i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
        int len = s.length();

        for(int i = 0; i < len; i++)
            count[s.charAt(i)]++;

        // Create an array of given String size
        char ch[] = new char[s.length()];
        for(int i = 0; i < len; i++){
            ch[i] = s.charAt(i);
            int find = 0;
            for(int j = 0; j <= i ; j++){
                //if any matches found
                if(s.charAt(i) == ch[j])
                    find++;
            }
            if(find == 1)
                System.out.println(s.charAt(i) + " is :" + count[s.charAt(i)]);
        }
    }
    public static void main(String[] args) {
        String s = "mumbai";
        getOccuringChar(s);
    }
}
