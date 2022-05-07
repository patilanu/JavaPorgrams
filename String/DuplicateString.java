package String;

//To find duplicate character in string
public class DuplicateString {
    public static void main(String[] args){

        String s = "Hello MuMbai";

        int cnt[] = new int[256];
        char[] c = s.toCharArray();
        System.out.println("Duplicate Character are : ");
        for(int i = 0; i < s.length(); i++){

            for(int j = i + 1; j < s.length(); j++){

                if( c[i] == c[j]){
                    cnt[(int) s.charAt(i)]++;
                   // System.out.println(i+ "-->"+cnt[i]);
                }
               /*
                if(c[i] == c[j]){
                    System.out.println(c[j]);
                    cnt++;
                }*/
            }

        }
        for (int i = 0; i < 256; i++) {
            if (cnt[i] != 0) {
                // System.out.println((char) i + " --> " + counter[i]);
                System.out.println((char)i + " --> " + cnt[i]);
            }
        }
    }
}
