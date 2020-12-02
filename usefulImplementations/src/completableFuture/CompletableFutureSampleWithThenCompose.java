package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompletableFutureSampleWithThenCompose {

    /**
     * We now embark on an essential chain function, "thenCompose". "thenCompose" is analogous to flatMap
     * in functional programming. It is used to carry value from one context to another. For example,
     * if I have one process that says that given a latitude and longitude, I want to find the closest city,
     * but now that I have the closest city, I want the weather of that city. If we were to perform to chain this
     * using thenApply, we would end up with CompletableFuture<CompletableFuture<Integer>>, which is undesirable
     * in this case since we want CompletableFuture<Integer>. In other words, when this CompletableFuture finally
     * resolves, we want an Integer—the answer—not another CompletableFuture.
     * In the following example, we find a city and state given some coordinates,
     * and a custom class Coordinates.Then, given the city and state, we want to find the
     * temperature given the string of the city and state. For a compositional chain like this,
     * we use thenCompose
     */

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(4);
        CompletableFuture<String> theClosestCity = findTheClosestCityState(new Coordinates(44.8408, 93.2983));
        CompletableFuture<Integer> integerCompletableFuture = theClosestCity.thenCompose(s -> getTemperatureInFahrenheit(s));
        integerCompletableFuture.thenAccept(d -> System.out.println(d));
        Thread.sleep(500);
        service.shutdown();
        service.awaitTermination(4, TimeUnit.SECONDS);
    }


    public static CompletableFuture<Integer> getTemperatureInFahrenheit(String city) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.print("Finding temperature for " + city);
            return 75;
        });
    }

    public static CompletableFuture<String>
    findTheClosestCityState(final Coordinates coordinates) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Finding the closest city and state with coordinates for " + coordinates);
            return " Ann Arbor, MI : ";
        });
    }

    public static class Coordinates {
        private double longitude;
        private double latitude;

        public Coordinates(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        @Override
        public String toString() {
            return new StringBuilder(Coordinates.class.getSimpleName())
                    .append(" Latitude = " + latitude)
                    .append(" longitude =" + longitude).toString();
        }
    }
}
