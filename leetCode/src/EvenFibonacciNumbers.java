public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        EvenFibonacciNumbers evenFibonacciNumbers = new EvenFibonacciNumbers();
        evenFibonacciNumbers.getEvenFibornacciSequence(100,1,2);
    }

    public int getEvenFibornacciNumbers(int element) {

        if (element <= 1) {
            return element;
        } else {
            return getEvenFibornacciNumbers(element-2) + getEvenFibornacciNumbers(element - 1);
        }
    }

    public void  getEvenFibornacciSequence(int element, int start, int end) {

        int n = 100, t1 = 1, t2 = 2;
        int total =0;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");
            if(t1%2==0){
                total+=t1;
            }
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            if(t1>=4000000){
                System.out.println("**************************");
                System.out.println("Your value is :"+sum);
                System.out.println("The n value is  :"+i);
                System.out.println("The total is :"+total);
                System.out.println("**************************");
                break;
            }
        }


    }
}
