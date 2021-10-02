import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseString {


    public static void main(String[] args) {

        ReverseString reverse = new ReverseString();
        String s = "this is string should be backwards";
        Stack<String> myStack = new Stack();
        myStack = reverse.reverseString(s, myStack);
        reverse.printString(myStack);
    }

    public Stack<String> reverseString(String s, Stack<String> myStack) {

        StringTokenizer stringTokenizer = new StringTokenizer(s);
        while (stringTokenizer.hasMoreTokens()) {

            myStack.push(stringTokenizer.nextToken());
        }

        return myStack;
    }

    public void printString(Stack<String> myStack) {

        System.out.println("  >>>>> Start ");
        while (!myStack.empty()) {

            System.out.print(myStack.pop() + " ");

        }
        System.out.println("\n  >>>>> End ");

    }
}
