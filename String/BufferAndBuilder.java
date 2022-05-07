package String;

public class BufferAndBuilder {
   public BufferAndBuilder(){
       System.out.println("Constructor of BufferAndBulder :");
    }
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Anuja");
        System.out.println("original string is ::" +sb + "\thaving length\t" +sb.length());

            //Using append method
        sb.append("Patil");
        System.out.println(sb);

        //using reverse method
        sb.reverse();
        System.out.println(sb);


        //String Builder
        StringBuilder sb1 = new StringBuilder("WelcomeToMumbai");
        System.out.println(sb1);
        sb1.replace(9,15,"Pune");
        System.out.println(sb1);
        sb1.delete(0,7);
        System.out.println(sb1);
        //capacity,insert,length..etc

    }
}
