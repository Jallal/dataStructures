
import usefulImplementations.StdRandom;


public class CalculateTheMedian {



    /*There are two sorted arrays nums1 and nums2 of size m and n respectively.
    *Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
    * You may assume nums1 and nums2 cannot be both empty.
     Example

    nums1 = [1, 3]
    nums2 = [2]

    The median is 2.0

     */




    public Comparable[] mergeTheTwoArrays(int[] a, int[] b){

        Comparable[] combinedArray = new Comparable[a.length+b.length];
        int k=0;

        for(int i=0;i<a.length;i++){

            combinedArray[k++]=a[i];
        }
        for(int j=0;j<b.length;j++){

            combinedArray[k++]=b[j];
        }

        return combinedArray;
    }



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
            while (less(a[lo], a[--j])) {
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

        StdRandom.shuffle(a);
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

    private static boolean less(Comparable v, Comparable w) {

        return v.compareTo(w) < 0;
    }

    /**
     * swap item in array a[] at index i with the one at index j
     */

    private static void exch(Comparable[] a, int i, int j) {

        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }



    public static int findMedianSortedArray(Comparable[] a){

        int midIndex = (a.length-1)/2;

        if(a.length%2==0){

            int i =midIndex;
            int j =midIndex+1;

            System.out.println("************ i: "+i+" j: "+j);
            int mid = (Integer.valueOf(a[i].toString())+Integer.valueOf(a[j].toString()))/2;
            return mid;
        }else{

            int k =midIndex;
            int mid = Integer.valueOf(a[k].toString());
            return mid;
        }
    }

    public static  void main(String[] args){
        CalculateTheMedian s = new CalculateTheMedian();

        int[] firstArray = {17,48,17,49};
        int[]  secondtArray = {16,-8,34};

        Comparable[] mergedArray = s.mergeTheTwoArrays(firstArray,secondtArray);

        s.sort(mergedArray);

        System.out.println("*************************************");
        for(int i=0;i<mergedArray.length;i++){
            System.out.println(mergedArray[i]+" \n");
        }
        System.out.println("*************************************");
        System.out.println("************ THE MEDIAN IS : "+findMedianSortedArray(mergedArray));

    }


}
