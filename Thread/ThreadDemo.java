package Thread;

class MultiThreading extends Thread{
    @Override
    public void run(){
        try {
            // Displaying the thread that is running
            Thread.sleep(5000);
            System.out.println("Thread " + Thread.currentThread().getId()
                            + " is running " + " and name of Running Thread is : " +Thread.currentThread().getName());
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
public class ThreadDemo  {
    public static void main(String[] args){
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultiThreading object = new MultiThreading();
            object.start();
        }
    }
}
