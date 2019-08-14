package sortingAlgorithms;

import static sortingAlgorithms.SelectionSort.ZERO;

public class MergeSort {
    /**
     * Merge sort is optimal with respect to # compares
     * Merge sort is not optimal with respect to space usage
     */


    public static void sort(Comparable[] a) {

    }


    /*
     *is item v less than w
     */
    private static boolean less(Comparable v, Comparable w) {

        return v.compareTo(w) < ZERO;
    }


    /**
     * swap item in array a[] at index i with the one at index j
     */

    private static void exch(Comparable[] a, int i, int j) {

        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
