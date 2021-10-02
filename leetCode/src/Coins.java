
public class Coins {

    /**
     * Problem: Consider an amount of n cents.
     * Count the ways you can change this amount using any number of quarters (25 cents),
     * dimes (10 cents), nickels (5 cents), and pennies (1 cent).
     *
     *
     * Solution: Let's imagine that we have to change 50 cents. Right from the start,
     * we can see that changing 50 cents is a problem that can be solved via sub-problems.
     * For example, we can change 50 cents using 0, 1, or 2 quarters. Or we can do it using 0, 1, 2, 3, 4, or 5 dimes.
     * We can also do it using 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, or 10 nickels.
     * Finally, we can do it using 0, 1, 2, 3, ..., 50 pennies.
     * Let's assume that we have 1 quarter, 1 dime, 2 nickels, and 5 pennies.
     * We can use our quarter to say the following:
     * */


    public static int calculateChangeMemoization(int n) {

        int[] coins = {25, 10, 5, 1};
        int[][] cache = new int[n + 1][coins.length];
        return calculateChangeMemoization(n, coins, 0, cache);
    }


    private static int calculateChangeMemoization(int amount, int[] coins, int position, int[][] cache) {

        if (cache[amount][position] > 0) {

            return cache[amount][position];
        }

        if (position >= coins.length - 1) {

            return 1;
        }

        int coin = coins[position];
        int count = 0;

        for (int i = 0; i * coin <= amount; i++) {

            int remaining = amount - i * coin;
            count += calculateChangeMemoization(remaining, coins, position + 1, cache);
        }

        cache[amount][position] = count;
        return count;
    }


    public static void main(String[] args) {

        System.out.println(">>>>>>>>>>>>>>>>>>>> "+Coins.calculateChangeMemoization(25));

    }
}
