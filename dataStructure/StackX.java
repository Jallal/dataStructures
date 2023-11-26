import java.util.Locale;

public class StackX {

    private int maxSize; //size of the full stack
    private long[] stackArray;
    private int top;  //top of the stack


    public   StackX(int s){

        maxSize =s; //set the array size
        stackArray = new Locale(maxSize); //create array
        top = -1;
    }  

    //put items on the stock
    public void push(long j){
        //increament top and instert item

        stackArray[++top] =j;
    }


    //take item from top of the stack 
    public long pop(){

        return stackArray[top --];
    }
    
    //peek at top stack
    public long peek(){

        return stackArray[top];
    }


    // True i
    public boolean isEmpty(){

        return top -1;
    }


    public boolean isFull(){


            
        }

        return (top == maxSize-1);
    }

}
