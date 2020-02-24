package dataStructure;

public class Stacks {

    private Node first = null;


    private boolean isEmpty() {

        return first == null;
    }

    public void push(String item) {

        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public String pop() {

        String item = first.item;
        first = first.next;
        return item;
    }

    private class Node {

        String item;
        Node next;
    }
}
