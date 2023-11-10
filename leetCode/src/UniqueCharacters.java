/***
 * Problem: Consider a string that can contain ASCII and Unicode characters ranging between 0-65,535.
 * Write a snippet of code that returns true if this string contains unique characters.
 * The whitespaces can be ignored.
 *
 * Solution: Let's consider the following three valid given strings:
 *
 * */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class UniqueCharacters {


    // private static final int MAX_CODE = 65535;


    // public static boolean isUnique(String str) {

    //     Map<Character, Boolean> chars = new HashMap<>();

    //     // or use, for(char ch : str.toCharArray()) { ... }
    //     for (int i = 0; i < str.length(); i++) {
    //         if (str.codePointAt(i) <= MAX_CODE) {
    //             char ch = str.charAt(i);
    //             if (!Character.isWhitespace(ch)) {
    //                 if (chars.put(ch, true) != null) {
    //                     return false;
    //                 }
    //             }
    //         } else {

    //             System.out.println("The given string contains unallowed characters");
    //             return false;
    //         }

    //     }
    //     return true;
    // }

    // public static Map<String, String> getHighFrequencyItems(Map<String, String> allElement){

    //     Integer target =null;
    //     Integer frequency =null;
    //     for(Map.entry<String, String> element : allElement.entrySet()){
    //         if(element.getKey() >= target){
    //             target = element.getKey();
    //             frequency = element.getValue();
    //         }else{
    //             allElement.remove(element);
    //         }
    //     }

    // }

    // // public static Map<String, String> getElementWIthFrequency(List<Integer>  arr){
     
    // //  Map<Integer, Integer> allElement = new HashMap<>();

    // //         for(Integer item : arr ){
             
    // //             if(!allElement.containsKey(item)){
    // //                 allElement.put(item, 1);
    // //             }else{
    // //              allElement.put(item, allElement.get(item)+1);
    // //             }
    // //         }
    // // }

    // public static ap<Integer, Integer> getLongestSubArray(Map<Integer, Integer> highFrequency, List<String> arr){


    //                Map<Integer, Integer> subArrMap = new HashMap<>();

    //                 for(Map.Entry<Integer, Integer> item : highFrequency.entrySet()){

    //                  subArrMap.put(arr.indexOf(item.toString),arr.lastIndexOf(item.toString));
    //                 }



    //                 for(Map.Entry<Integer, Integer> finalItem : subArrMap.entrySet()){

    //                     int subArrLength = finalItem.getValue() - finalItem.getKey();

                    

    //                 }
            
    //                 return subArrMap;

    // }

       public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double median=0.0;
     
        int[] combinedArr = new int[nums1.length + nums2.length];

            System.arraycopy(nums2, 0, combinedArr, 0, combinedArr.length);



       return median;
    }


    public static void main(String[] args) {

        String str = "Hello my name is Jallal";
        //System.out.println(">>>>>>>> is String unique >>>>>>>>>>>> : " + isUnique(str));

        //List<Integer>  arr = new ArrayList<>();
        //Map<Integer, Integer> allElement = getElementWIthFrequency(arr);
       // Map<Integer, Integer> highFrequency = getHighFrequencyItems(allElement);
        // Map<Integer, Integer> subArrMap = getLongestSubArray(highFrequency);


        //find the median of two arries 
        int[] nums1 = {1,4,8,9};
        int[] nums2 = {7,2,6};

        findMedianSortedArrays(nums1,nums2);

    }
}
