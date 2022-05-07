package methodOverloading;

class Abc{
    void form(int i){
        System.out.println(10);
    }
    static void form(String s){
        System.out.println("Anuja"+s);
    }
}
public class FormClass {

    public static void main(String[] args){
        Abc a = new Abc();
        a.form(11);
        a.form("\tPatil");
    }
}
