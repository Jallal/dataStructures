public class InsertionSort {
    /*
     *
     * Example : 7,10,5,3,8,4,2,9,6
     * First :  we start by initializing i which the first element "7" so  [7],10,5,3,8,4,2,9,6
     * Second is to increment the i : [7,10],5,3,8,4,2,9,6 because 10 is bigger than 7 we it's already sorted and we have nothing to do
     * Third  is to increment the i again: [7,10,5],3,8,4,2,9,6 because 5 is less than 10 we have work to do
     *** so keep moving 5 to the left and exchange with any element that's greater so [7,5,10],3,8,4,2,9,6 still not in palace so exchange with the 7 : [5,7,10],3,8,4,2,9,6
     *  and keep moving until the end of the array
     * */


    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[i], a[j - 1])) {
                    exch(a, j, j - 1);
                } else {
                    break;
                }

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
