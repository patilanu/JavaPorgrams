package ExceptionHandling;

class Laptop extends RuntimeException {
    public Laptop(){
        super();
        System.out.println("Constructor of Laptop");
    }
}

public class Assignment {
    public void Mobile() {
            throw new Laptop();
    }
    public static void main(String[] args){
        try{
            //System.out.println("Hello");
            new Assignment().Mobile();

            System.out.println("try-block..");
        }catch (Exception e){
            System.out.println("Runtime Exception ...");
        }finally {
            System.out.println("I am Finally block..");
        }
    }
}
