import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrimeFactor {


    public static void main(String[] args) {

        //get the longest prime factorial
        long n = 600851475143L;
        PrimeFactor primeFactor = new PrimeFactor();
        System.out.print(" Longest factorial : "+primeFactor.getLogestFactorial(n));
    }




    public long largestPalindromeProduct(int n1, int n2){

        int result = n1*n2;
return 0;
    }

    public boolean isPalindrome(int n){

        ArrayList<Long> arr = new ArrayList<>();

        return false;
    }



    public long getLogestFactorial(long n){
            ArrayList<Long> arr = new ArrayList();

            for(long i=2; i<n;i++){
                if(n%i==0){
                    n=n/i;
                    arr.add(i);
                }
            }
            arr.add(n);
            arr.forEach( i-> System.out.print(i+","));
        return arr.get(arr.size()-1);
        }
}
