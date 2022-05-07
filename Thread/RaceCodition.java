package Thread;

class MyRunnable implements Runnable{

    @Override
    public void run() {
    for(int i= 0 ; i < 5; i++){
        System.out.println(Thread.currentThread().getName() + "- Number :" +i);
    }
    }
}
public class RaceCodition {
    public static void main(String[] args){
        Thread t1 = new Thread(new MyRunnable(), "Thread1");
        Thread t2 = new Thread(new MyRunnable(), "Thread2");
        t1.start();
        t2.start();
    }
}
