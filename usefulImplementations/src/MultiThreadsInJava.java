import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MultiThreadsInJava {

        public static void main(String[] args)
                throws ExecutionException, InterruptedException {
            ExecutorService executorService =
                    Executors.newFixedThreadPool(5);

            Callable<Integer> callable = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    System.out.println("Inside the future: " +
                            Thread.currentThread().getName());
                    System.out.println("Future priority: "
                            + Thread.currentThread().getPriority());
                    Thread.sleep(5000);
                    return 5 + 3;
                }
            };

            System.out.println("In test: " +
                    Thread.currentThread().getName());
            System.out.println("Main priority: " +
                    Thread.currentThread().getPriority());

            Future<Integer> future = executorService.submit(callable);

            //This will block
            Integer result = future.get(); //block
            System.out.println("result = " + result);
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        }
}
