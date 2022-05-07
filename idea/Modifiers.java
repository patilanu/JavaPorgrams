package idea;

public class Modifiers {
    public String name = "anuja";
    private String userName = "patil";
    protected String pwd = "abc";
    int a = 20;

    public void wifi() {

        System.out.println("Public method in first package:");
    }
    protected void button(){
        System.out.println("protected method in first package:");
    }
    void hifi(){
        System.out.println("Default method in first package:");
    }
}
