package Java8_Features;

interface P{
    void show(int i);
    //void test();
}
public class LambdaDemo {
    public static void main(String[] args){
        P obj;
      /*  obj = new P(){
            @Override
            public void show(int i) {
                System.out.println("Hello" +i);
            }
        }; */
        obj = (i)-> System.out.println("Hello" +i);
        obj.show(6);
    }
}
