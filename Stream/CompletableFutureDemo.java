package Stream;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static int generate(){
        //System.out.println("doing work " + Thread.currentThread());   //1
        throw new RuntimeException("oops something went wrong..");    //3
        //return 2;
    }
    public static void printIt(int value){
        //System.out.println(value + "  " + Thread.currentThread());
        System.out.println(value);
    }
    public static void main(String[] args) throws InterruptedException {
        /*CompletableFuture.supplyAsync(CompletableFutureDemo :: generate)   //1
                .thenApply(data -> data * 2)
                .thenAccept(data -> printIt(data));*/

        /*CompletableFuture<Integer> future = new CompletableFuture<>();   //2
            future
                    .thenApply(data -> data * 2)
                    .thenAccept(data -> printIt(data));
            *//*Thread.sleep(2000);
            future.complete(7);*/
        CompletableFuture.supplyAsync(CompletableFutureDemo :: generate)    //3
                .exceptionally(throwable -> {
                    System.out.println(throwable);
                    return 0;
                });
    }
}
