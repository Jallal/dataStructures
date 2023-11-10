// import java.util.Map;

// import javax.print.attribute.HashAttributeSet;
import java.lang.*;
import java.util.*;

public class BinaryRepresentation {

    public static void main(String[] args) {

        // System.out.println("******************");
        // int[] nums1 ={1,3};
        // int[] nums2 = {2};
        // List<Integer> list1 = new ArrayList<>();
        // List<Integer> list2 = new ArrayList<>();
        // list1.add(1);
        // list1.add(2);
        // list2.add(3);
        //   list2.add(4);

        // System.out.println("Answer Array: "+findMedianSortedArrays(nums1,nums2));

        // System.out.println("Answer List: "+findMedianSortedLists(list1,list2));

        // String s = "ac"; 
        // System.out.println("Answer Array: "+ longestPalindrome(s));

           System.out.println("Answer int: "+ reverse(123));
           System.out.println("Answer int: "+ reverse(-123));
           System.out.println("Answer int: "+ reverse(120));
 
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int combinedSize = 0;
        double median = 0.0;

        if(nums1.length>0){

            combinedSize = combinedSize + nums1.length;
        }
        if(nums2.length>0){

            combinedSize = combinedSize+ nums2.length;
        }

        int[] combinedarr = new int[combinedSize];
        System.out.println(" Combined array size : ****************** : "+combinedSize);
        //System.arraycopy(source_arr, sourcePos, dest_arr, destPos, len);
        System.arraycopy(nums1,0,combinedarr,0,nums1.length);
        System.out.println(Arrays.toString(combinedarr));
        System.arraycopy(nums2,0,combinedarr,nums1.length,nums2.length);
        System.out.println(Arrays.toString(combinedarr));
        Arrays.sort(combinedarr);
        System.out.println(Arrays.toString(combinedarr));

        if(combinedSize % 2 != 0 ){

            median = (double)(combinedarr[combinedSize/2]);
        } else{
            
            median = (double)(combinedarr[(combinedSize - 1) / 2] + combinedarr[combinedSize / 2]) / 2.0;
        }

        return median;
    }



     public static double findMedianSortedLists(List<Integer> nums1, List<Integer> nums2) {
         int combinedSize = 0;
        double median = 0.0;
        nums1.addAll(nums2);
        Collections.sort(nums1);
        combinedSize = nums1.size();
        System.out.println(" Combined array size : ****************** : "+combinedSize);
        if(combinedSize % 2 != 0 ){

            median = nums1.get(combinedSize/2);
        } else{
            
            median = (nums1.get((combinedSize - 1) / 2) + nums1.get(combinedSize / 2)) / 2.0;
        }

        return median;
    }


//     Given a string s, return the longest 
// palindromic
 
// substring
//  in s.

 

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"

        /**
         * @param s
         * @return
         */
        public static String longestPalindrome(String s) {
            char[] palindrome = new char[s.length()];
            char[] arr = s.toCharArray();
            String answer = null;
          

            for(int i = 0; i < arr.length ; i++){

                if(arr[i]==arr[(arr.length-1) - i]){
                    palindrome[i]=arr[i];
                    palindrome[(arr.length-1)  - i]=arr[(arr.length-1)  - i];
                }

            }
            StringBuilder finalString = new StringBuilder();

            for(char b : palindrome){
                if(!Character.isWhitespace(b)){
                    finalString.append(b);

                }

            }
    
                
            return finalString.toString().trim();
        }



        // Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
        // Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
            //Example 1:
            // Input: x = 123
            // Output: 321

            // Example 2:
            // Input: x = -123
            // Output: -321

            // Example 3:
            // Input: x = 120
            // Output: 21

            
        

            public static int reverse(int x) {
              
                String str = Integer.toString(x);  
                char[] cha = str.toCharArray();
                boolean isNegativeDigit = false;
                StringBuilder reveredInt = new StringBuilder();
                if(cha.length !=0 && cha[0] == '-'){
                    isNegativeDigit = true;
                }

                for(int i=0; i< cha.length ;i++ ){
                //if(Character.isDigit(cha[(cha.length-1) -i])){
                reveredInt.append(cha[(cha.length-1) -i]);
              // }
                }

                int revertInt = Integer.valueOf(reveredInt.toString());

                if(isNegativeDigit){

                revertInt = revertInt*-1;
                }

                return revertInt;
            }



             public static boolean isPalindrome(int x) {
                String str = Integer.toString(x);
                char[] arr = str.toCharArray();
                boolean answer = false;
                for(int i = 0; i < arr.length ; i++){
                    if(arr[i]==arr[(arr.length-1) - i]){
                        answer = true;
                    }else{
                        return false;
                    }
                }
                return answer;
        }


}
