public class stackXMain {


    public static void main(Staing[] args){

    //make new stack
    StackX theStack = new StackX(100);
    //push item into the stack
    theStack.push(20);
    theStack.push(40);
    theStack.push(60);
    theStack.push(80);

    while(!theStack.isEmpty()){

        long value = theStack.pop();
        System.out.println(" \\n Printing the items one by one : "+ value);
    }
    }
}
