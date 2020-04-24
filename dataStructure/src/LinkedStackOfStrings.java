
public class LinkedStackOfStrings {

    private Node first;

    public static void main(String[] args) {

        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        stack.push("item 1");
        stack.push("item 2");
        stack.push("item 3");
        System.out.println(toString(stack));
        System.out.println("************");
        stack.pop();
        System.out.println(toString(stack));
    }

    public boolean isEmpty() {


        return (first == null);
    }

    public void push(String item) {

        // Insert a new node at the beginning of the list.
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public String pop() {

        // Remove the first node from the list and return item.
        String item = first.item;
        first = first.next;
        return item;
    }

    private class Node {

        private String item;
        private Node next;
    }

    public static String toString(LinkedStackOfStrings stack) {
        StringBuilder builder = new StringBuilder();
        Node root = stack.first;
        while (root != null) {
            builder.append(root.item+" ");
            root = root.next;
        }
        return builder.toString();
    }

}
