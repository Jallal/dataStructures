public class LinkedStackOfStrings {

    private Node first;


    public boolean isEmpty(){

        return first==null;
    }


    public String pop(){

        String payload = first.payload;
        first = first.next;
        return payload;
    }

    public void push(String payload) {

        Node oldFirst =first;
        first = new Node();
        first.payload=payload;
        first.next=oldFirst;
    }


private class Node{

    String payload;
    private Node next;
}
}
