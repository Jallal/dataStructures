public class QuickSort {

    /**
     * The big advantage of quick sort over merge sort is it makes
     * sorting in place and doesn't take any space
     *
     * Quick sort is faster than merge sort
     *
     * */




    /**
     * Phase I: repeat until i and j pointers cross
     * scan i from left to right so long as (a[i]<a[lo])
     * scan j from tight to left so log as (a[j]> a[lo])
     * exchange a[i] with a[j]
     *
     * Example : [K,R,A,T,E,L,E,P,U,I,M,Q,C,X,O,S]
     *            ^ ^                           ^
     *            | |                           |
     *           lo i                           j
     *
     * i will move from right to left until find element bigger than the partition element
     * j will move from left to right until find element bigger than the partition element
     *
     * Example : [K,R,A,T,E,L,E,P,U,I,M,Q,C,X,O,S]
     *            ^ ^                     ^
     *            | |                     |
     *           lo i                     j
     *
     *In this case I stops immediately because  R is bigger than K J keeps moving until it get to the C which smaller than K
     * Example : [K,C,A,T,E,L,E,P,U,I,M,Q,R,X,O,S]
     *            ^ ^                     ^
     *            | |                     |
     *           lo i                     j
     *
     * So we exchange C and  R meaning value of i and j
     *
     * Example : [K,C,A,T,E,L,E,P,U,I,M,Q,R,X,O,S]
     *            ^     ^           ^
     *            |     |           |
     *           lo     i           j
     *
     * Exchange
     *
     * Example : [K,C,A,I,E,L,E,P,U,T,M,Q,R,X,O,S]
     *            ^     ^           ^
     *            |     |           |
     *           lo     i           j
     * */




    /**
     * below is a quick implementation olf the quick sort partitionig methos
     * */

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            //find item on left to swap
            while (less(a[++i], a[lo])) {
                if (i == hi) {
                    break;
                }

            }
            //find item on the right to swap
            while (less(a[lo], a[-j])) {
                if (i == lo) {
                    break;

                }

            }
            //check if pointers cross
            if (i >= j) {
                break;
            }

            exch(a, i, j);//swap
        }
        //swap with partition item
        exch(a, lo, j);
        //return index of item now known to be in place
        return j;

    }

    /**
     * Quick sort using recursion
     *
     * */

    public static void sort(Comparable[] a){

        //StdRandom.shuffle(a);
        sort(a,0,a.length-1);

    }
    /**
     * recursive class
     * */
    public static void sort(Comparable[] a, int lo, int hi){
        if(hi<=lo){
            return;
        }
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);

    }



        //3 ways quicksort : java implementation

    private static void threWaySort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int lt = lo, gt = hi;
        Comparable v = a[lo];
        int i = lo;
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                exch(a, lt++, i++);
            } else if (cmp > 0) {
                exch(a, i, gt--);
            } else {
                i++;
            }


            sort(a, lo, lt - 1);
            sort(a, gt + 1, hi);
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
     *
     */

    private static void exch(Comparable[] a, int i, int j) {

        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void main(String[] args){

        Comparable[] arr = new Comparable[12];

    }
}