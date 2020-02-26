public class SelectionSort {

    public static final int ZERO = 0;


    /**
     * the idea of selection sort is, to start out with unsorted array, and we'll
     * use these playing cards as an example. in the ith iteration, we go through array and try
     * to find the smallest remaining entry. in this case, the 2 is the smallest entry. Then, we'll swap
     * that with the first entry in the array, and then we know we've got one step done.
     * <p>
     * Example data : 7,10,5,3,8,4,2,9,6 swap the 2 with the first 2,10,5,3,8,4,7,9,6 now the first entry is sorted
     * and we move to the 2nd entry in the array.the 2nd step will be moving the 3 to 2nd position: 2,3,5,10,8,4,7,9,6
     * and so fourth
     **/

    private static void sort(Comparable[] a) {

        int N = a.length;
        for (int i = 0; i < N; i++) {
            //min is the indext of the samllest elelmnt in the array
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                    exch(a, i, min);

                }

            }

        }

    }

    /**
     * test if an array is sorted
     */

    private static boolean isSorted(Comparable[] a) {

        for (int i = 0; i < a.length; i++)

            if (less(a[i], a[i - 1])) return false;
            return true;
    }

    /*
    *is item v less than w
     */

    private static boolean less(Comparable v, Comparable w) {

        return v.compareTo(w) < ZERO;
    }

    /**
     * swap item in array a[] at index i with the one at index j
     *
     */

    private static void exch(Comparable[] a, int i, int j) {

        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
