public class BST<String extends Comparable<String>> {

// BST : binary search tree is a binary tree in symetric order.
// A BST s either empty or or two disjoined binary trees (left amd right)
    //Every node has a key and every node's key is:
    //1-larger than all keys its left subtree
    //2-Smaller than all keys in its right subtree

    private Node root;


    public void put(String k, String val) {


        root = put(root, k, val);
    }

    private Node put(Node x, String k, String val) {


        if (x == null) {
            return new Node(k, val);
        }
        int cmp = k.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, k, val);
        } else if (cmp > 0) {
            x.right = put(x.right, k, val);
        } else if (cmp == 0) {
            x.val = val;
        }
        return x;
    }

    //return value corresponding to a given key or null if no suck a key
    public String get(String k) {


        Node x = root;
        while (x != null) {
            int cmp = k.compareTo(x.key);
            if (cmp < 0) {
                x = x.left;
            } else if (cmp > 0) {
                x = x.right;
            } else if (cmp == 0) {
                return x.val;
            }
        }
        return null;
    }

    public void delete(String key) {

    }


    public Iterable<String> iterator() {
        return null;

    }


    private class Node {

        public String key;
        public String val;

        public Node left, right;


        public Node(String key, String val) {
            this.key = key;
            this.val = val;
        }
    }

}
