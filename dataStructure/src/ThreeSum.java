public class ThreeSum {


    public static int count(int[] a) {

        int n = a.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        
        /**
         * Program to measure the running time for your program
         *
         * */

        int[] a = In.readInts(args[0]);
        long start = System.currentTimeMillis();
        System.out.println("Here is your count : "+count(a));
        long finish = System.currentTimeMillis();
        System.out.println("Time taken : {}"+(finish-start));

    }
}
