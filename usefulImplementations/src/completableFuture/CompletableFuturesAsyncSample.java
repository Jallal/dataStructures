package completableFuture; /**
 * With each function that we apply to our chain, or stage, we can choose to use Async version of the operation.
 * For example, if we want to use the "thenApply" but on a different thread, we can call the "thenApplyAsync".
 * Later, we use "thenCompose", and that too has an "Aync" alternative. Of course, "then Accept" has asynchronous
 * alternative "thenAcceptAsync"
 * */

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompletableFuturesAsyncSample {


    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(4);
        CompletableFuture<Integer> futureOne = CompletableFuture.supplyAsync(()->5, service);
        futureOne.thenApplyAsync(x -> x+15 +" From thread pool : "+Thread.currentThread().getName()).
                thenAcceptAsync(x-> System.out.println(" The running sum is : "+x +" From thread pool : "+Thread.currentThread().getName()));

        System.out.println(" From thread pool main:" + Thread.currentThread().getName());
        Thread.sleep(100);
        service.shutdown();
        service.awaitTermination(4, TimeUnit.SECONDS);
    }


}
