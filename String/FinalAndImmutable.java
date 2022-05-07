package String;

public class FinalAndImmutable {
    public static void main(String[] args){
        final StringBuffer sb = new StringBuffer("Mumbai"); //here reference variable is final
        sb.append("Pune");
        System.out.println(sb);

       // sb = new StringBuffer("Anuja"); //cant reassign for final variable
        System.out.println(sb);
    }
}
