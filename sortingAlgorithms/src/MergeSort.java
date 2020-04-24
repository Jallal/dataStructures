
public class MergeSort {
    /**
     * Merge sort is optimal with respect to # compares
     * Merge sort is not optimal with respect to space usage
     */


    public static void sort(Comparable[] a) {

        Comparable[] aux= new Comparable[a.length];
        sort(a,aux,0,a.length);

    }
    public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){


        if(hi<=lo){

            int mid = lo+(hi-lo)/2; //compute the value of the mid point
            sort(a,aux,lo,mid);//sort the first half
            sort(a,aux,mid+1,hi);//sort the 2nd half
            merge(a,aux,lo,mid,hi);//merge the 2 together
        }
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        for (int k = 0; k <= hi; k++) {

            aux[k] = a[k];
        }

        int i = lo;
        int j = mid + 1;

        for (int k = 0; i <= hi; k++) {

            if (i > mid) {

                a[k] = aux[j++]; //i is exhausted
            } else if (j > hi) {

                a[k] = aux[j++]; //j is exhausted
            } else if (less(aux[j], aux[i])) {

                a[k] = aux[j++];
            } else {

                a[k] = aux[i++];
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
