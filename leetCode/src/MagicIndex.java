/***
 *
 * Problem: Consider a sorted array of n elements that allows duplicates.
 * An index k is magic if array[k] = k. Write a recursive algorithm that finds the first magic index.
 *
 * Solution: First, let's quickly draw two sorted arrays containing 18 elements, as shown in the following diagram.
 * The array at the top of the image contains no duplicates, while the array at the bottom contains duplicates.
 * This way, we can observe the influence of these duplicates:
 *
 * */

public class MagicIndex {

    public static int find(int[] arr) {
        return find(arr, 0, arr.length - 1);
    }

    private static int find(int[] arr, int startIndex, int endIndex) {

        if (startIndex > endIndex) {
            return -1; // return an invalid index
        }

        // halved the indexes
        int middleIndex = (startIndex + endIndex) / 2;

        // value (element) of middle index
        int value = arr[middleIndex];

        // check if this is a magic index
        if (value == middleIndex) {

            return middleIndex;
        }

        // search from middle of the array to the left
        int leftIndex = find(arr, startIndex, Math.min(middleIndex - 1, value));

        if (leftIndex >= 0) {
            return leftIndex;

        }

        // search from middle of the array to the right
        return find(arr, Math.max(middleIndex + 1, value), endIndex);

    }

    public static void main(String[] args) {


        int[] arr = {1,4,4,4,5,5,6,6,6,11,12,12,12,15,17,20,21,21};

        System.out.println(">>>>>>>>>>>>>>>>>>>> "+find(arr));

    }

}

