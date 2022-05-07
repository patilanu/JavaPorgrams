package Java8_Features;

interface Mumbai{
    void City(int i);
}
public class LambdaExprseeion {
    public static void main(String[] args){
        Mumbai m ;
       /* m = new Mumbai(){
            @Override
            public void City(int i){
                System.out.println("Interface Mumbai" +i);
            }
        };*/
        m =  i-> System.out.println("Interface Mumbai" +i);
        m.City(6);
    }
}
