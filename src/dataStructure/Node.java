package dataStructure;

public class Node {

    public Key key;
    public Value val;

    public Node left, right;


    public Node(Key key, Value val) {
        this.key = key;
        this.val = val;
    }
}
