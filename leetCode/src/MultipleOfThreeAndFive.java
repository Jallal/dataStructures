public class MultipleOfThreeAndFive {



    public int getSumOfMultiple(int value){

        int n=0;
        int sum=0;
        while(n<value) {
            if (n % 3 == 0 || n % 5 == 0) {
                sum +=n;
            }
            n++;
        }
        return sum;
    }


    public static void main(String[] args){

        MultipleOfThreeAndFive multipleOfThreeAndFive = new MultipleOfThreeAndFive();
        System.out.println(multipleOfThreeAndFive.getSumOfMultiple(1000));
    }
//233168
// 233168
}
