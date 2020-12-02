package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * We can handle any "Exception" that may arise in our "CompletableFuture" with "exceptionally"
 * Exceptionally takes a "Function" where the argument is the "Throwable" that just occurred.
 * The end user must decide what to do with "Throwable" and provide an alternate with the correct type.
 * What is meant by correct type. In the example below, we are running "featureOne.thenApply(Integer::ParseInt)"
 * where we first start with a "CompletableFeature<String>", but after "thenAply" we expect that the type will be
 * "CompletableFeature<Integer>" since we are parsing. If there is a "Throwable" that occurs, we still expect
 * a "CompletableFeature<Integer>", so, we are choosing "-1" as alternate:
 * */

public class CompletableFutureSampleWithExceptionHandling {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<String> featureOne = CompletableFuture.supplyAsync(()->{
           try{

               System.out.println("FeatureOne is sleeping in thread : " +Thread.currentThread().getName());
               Thread.sleep(1000);
           }catch(InterruptedException e){
               e.printStackTrace();
           }

           return "Hello World 1!";
        },executorService);

        featureOne.thenApply(x->Integer.parseInt(x)).exceptionally(t->-1).thenAccept(d->System.out.println(d));
        System.out.println("This message should appear first");
        Thread.sleep(1100);
        executorService.shutdown();
        executorService.awaitTermination(4, TimeUnit.SECONDS);
    }
}
