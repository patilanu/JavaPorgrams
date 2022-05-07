package Thread;

class Sender{
    public void send(String msg) {
        System.out.println("Sending\t" + msg);
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread  interrupted.");
        }

        System.out.println("\n" + msg + "Sent");
    }
}
class Thread1 extends Thread{
    private String msg;
    Sender  sender;
    Thread1(String s, Sender obj){
        this.msg = s;
        this.sender = obj;
    }
    public void run() {
        // Only one thread can send a message
        // at a time.
        synchronized (sender) {
            // synchronizing the send object
            sender.send(msg);
        }
    }
}
public class SyncDemo {
    public static void main(String[] args){
        Sender s = new Sender();
       //s.send("Saee");
        Thread1 t1 = new Thread1("hiiie", s);
        Thread1 t2 = new Thread1("Bye", s);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println("Interrupt..");
        }
    }
}
