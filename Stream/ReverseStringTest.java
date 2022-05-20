package Stream;

public class ReverseStringTest {

    public static void main(String[] args) {

        String s = "Anuja";
        String rvs = "";
        //int length = s.length();
        for(int i = s.length()-1 ; i >= 0 ; i--){
            rvs = rvs + s.charAt(i);
        }
        System.out.println(rvs);
    }

}
