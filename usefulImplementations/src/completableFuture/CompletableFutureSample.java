package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompletableFutureSample {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(4);
        CompletableFuture<Integer> futureOne = CompletableFuture.supplyAsync(()->5, service);
        futureOne.thenApply(x -> x+15 +" From thread pool : "+Thread.currentThread().getName()).
                thenAccept(x-> System.out.println(" The running sum is : "+x +" From thread pool : "+Thread.currentThread().getName()));

        System.out.println(" From thread pool main:" + Thread.currentThread().getName());
        Thread.sleep(100);
        service.shutdown();
        service.awaitTermination(4, TimeUnit.SECONDS);
    }

}
