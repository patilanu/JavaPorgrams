package Thread;

class Demo {
    int counter; //600 both t1&t2
     public synchronized void increment(){

         counter++;  //counter = counter + 1;
     }
}
public class SynchronizationDemo {
    public static void main(String[] args) throws Exception {
        Demo d = new Demo();
       // d.increment();
       // d.increment();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
               for(int i = 1 ; i <= 500; i ++){
                   d.increment();
               }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1 ; i <= 1000; i++){
                    d.increment();
                }
            }
        });
        t1.start();
        //t2.start();

        t1.join();  //asking thread to wait to complete t1 job
        //t2.join();
        System.out.println("Counter Value : " +d.counter);
    }
}
