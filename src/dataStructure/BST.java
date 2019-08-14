package dataStructure;

public class BST<Key extends Comparable<Key>, Value> {


    //serach : if

    private Node root;


    public void put(Key k, Value val) {


        root = put(root, k, val);
    }

    private Node put(Node x, Key k, Value val) {


        if (x == null) { return new Node((dataStructure.Key) k, (dataStructure.Value) val); }
        int cmp = k.compareTo((Key) x.key);
        if (cmp < 0) { x.left = put(x.left, k, val); }
        else if (cmp > 0) { x.right = put(x.right, k, val); }
        else if (cmp == 0) { x.val = (dataStructure.Value) val; }
        return x;
    }

    //return value corresponding to a given key or null if no suck a key
    public Value get(Key k) {


        Node x = root;
        while (x != null) {
            int cmp = k.compareTo((Key) x.key);
            if (cmp < 0) { x = x.left; }
            else if (cmp > 0) { x = x.right; }
            else if (cmp == 0) { return (Value) x.val; }
        }
        return null;
    }

    public void delete(Key key) {

    }


    public Iterable<Key> iterator() {

    }


}
