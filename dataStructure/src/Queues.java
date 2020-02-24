package dataStructure;

public class Queues {
    private Node first;
    private Node last;


    public String dequeue() {


        String item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

    public void enqueue(String item) {

        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }

    }

    private boolean isEmpty() {
        return first == null;
    }


    private class Node {

        String item;
        Node next;
    }
}
