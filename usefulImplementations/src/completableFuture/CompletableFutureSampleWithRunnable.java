package completableFuture; /**
 * After our completable feature is complete, we can run a Runnable instance using "thenRun".
 * if you're wondering what's the difference between "thenAccept" and "thenRun" is, "thenAccept" accept
 * the result of our chain, but "thenRun" does NOT accept any parameter. It's solely an action that runs
 * at the end of our completableFuture chin. If you wish for "thenRun" to run on a separate thead, keep in mind there is
 * also a "ThenRunAsync"
 * */

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompletableFutureSampleWithRunnable {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<Integer> featureOne = CompletableFuture.supplyAsync(()-> 5,executorService);
        featureOne.thenRun(()->{
            System.out.println(new StringBuilder().append("I'm working on something else once that feature has been triggered")
                    .append(" Run inside  : "+Thread.currentThread().getName()));
        });

        Thread.sleep(500);
        executorService.shutdown();
        executorService.awaitTermination(4, TimeUnit.SECONDS);
    }
}
