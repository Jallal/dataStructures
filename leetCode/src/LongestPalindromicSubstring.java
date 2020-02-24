package leetCode;

public class LongestPalindromicSubstring {


    public boolean checkIsPalindromic(char[] a) {


        for (int i = 0; i <a.length-1; i++) {

            if (a[i] != a[a.length-1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static char[] convertIntoAnArry(String str){
        char[] chr = new char[str.length()];

        for(int i=0;i< str.length();i++){

            chr[i]=str.charAt(i);
        }

        return chr;
    }


    public String[] findSubString(String str){

        char[] chr = convertIntoAnArry(str);
        String[] listOfSubStrings= new String[100];
        int k =0;
        for(int j=0;j<chr.length-1;j++) {
            for (int i = chr.length-1; i > 0; --i) {

                if(chr[j]==chr[i] &&i!=j&&j<i){
                    listOfSubStrings[k++]=str.substring(j,i+1);
                }
            }
        }
        return listOfSubStrings;
    }




    public static void main(String[] args){


        LongestPalindromicSubstring s = new LongestPalindromicSubstring();
        String isPalindromic ="a";
        String palindromicString=null;
         String[] subStringsList=s.findSubString(isPalindromic);
        for(int i=0;i<subStringsList.length-1;i++){
            if(subStringsList[i]!=null &&s.checkIsPalindromic(convertIntoAnArry(subStringsList[i]))) {
                if(palindromicString.length()<=subStringsList[i].length()){
                    palindromicString=subStringsList[i];
                }
            }
        }
        System.out.println("***********************************\n");
        System.out.println(palindromicString);
        System.out.println("***********************************\n");
    }
}
