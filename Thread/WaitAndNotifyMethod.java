package Thread;

class A {
    int num;
    boolean valueSet = false;

    public synchronized void set(int num){
        while(valueSet) {
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println("Set : " +num);
        this.num = num;
        valueSet = true;
        notify();
    }
    public synchronized void get(){
        while (!valueSet){
            try {
                wait();
            }catch(Exception e){}
        }
        System.out.println("Get :" +num);
        valueSet = false;
        notify();
    }
        }
class Producer implements Runnable{
    A a;   //need object of A

    public Producer(A a) {
        this.a = a;
        Thread t = new Thread(this, "Producer");  // to call run method
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            a.set(i++);
            try {  //want to hold for sometime
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
class Consumer implements Runnable{
    A a;

    public Consumer(A a) {
        this.a = a;
        Thread t = new Thread(this, "Consumer");  // to call run method
        t.start();
    }

    @Override
    public void run() {
    while(true){
        a.get();
        try {  //want to hold for sometime
            Thread.sleep(1000);
        }catch (Exception e){}
    }
    }
}
public class WaitAndNotifyMethod {
    public static void main(String[] args){
        A a = new A();
        new Producer(a);  //Annonymous object??
        new Consumer(a);
    }
}
