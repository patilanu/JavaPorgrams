package idea1;
import idea.*;

class Page extends Modifiers {
    void note(){
       // System.out.println("Public String from First packege :" +name);
        Page p = new Page();
        p.button();
    }
}

public class AccssModifiers extends Modifiers {
    public static void main(String[] args){

        AccssModifiers ac = new AccssModifiers();
        ac.wifi();
        ac.button();

    }
}
