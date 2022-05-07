package String;

public class StringClassMethods {
    public static void main(String[] args){

        //"abc".charAt(0);
        System.out.println("abc".charAt(0));
        System.out.println("abc".compareTo("abc"));
        System.out.println("abc".indexOf('c'));

        String a = new String("anuja");
        System.out.println(a);
        String b = new String("anuja");
        System.out.println(b);

       a = a.concat("Patil");          //changed immutable to mutable
        System.out.println(a.concat("patil"));
    }
}
