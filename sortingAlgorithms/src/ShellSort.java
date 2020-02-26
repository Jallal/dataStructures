

public class ShellSort {

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1;//1,4,13,40,121,364
        }
        while (h >= 1) {//h-sort the array
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);

                }
                h = h / 3;
            }

        }

    }
    /*
     *is item v less than w
     */

    private static boolean less(Comparable v, Comparable w) {

        return v.compareTo(w) < SelectionSort.ZERO;
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
