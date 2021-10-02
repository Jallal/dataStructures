
public class Queues {
    private Node last;
    private Node first;

    public boolean isEmpty(){

        return first==null;
    }


    public String dequeue(){
     String payload = first.payload;
        first = first.next;
        if(isEmpty()){
            last=null;
        }

        return  payload;
    }

    public void enqueue(String payload){

        Node oldLast = last;
        last = new Node();
        last.payload = payload;
        last.next=null;
        if(isEmpty()){
            first=last;
        }else{
            oldLast.next=last;
        }
    }

    private class Node{
     String payload;
     Node next;
    }
}
