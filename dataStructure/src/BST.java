public class BST<String extends Comparable<String>> {

    /**
     * BST : BST is binary tree with symmetric order
     * BST : either empty or two disjointed binary trees (left and right)
     * Every node has key and every node's key is
     * 1) larger than all keys to it left
     * 2) Smaller than all keys in its right
     */


    private Node root;

    public void put(String key, String value){

        root = put(root, key,value);
    }

    private Node put(Node x, String key, String value){

        if(x==null){
            return new Node(key,value);
        }

        int cmp = key.compareTo(x.key);
        if(cmp<0){
          x.left = put(x.left,key,value);
        }else if(cmp >0 ){
            x.right = put(x.right,key,value);
        }else if(cmp ==0){
            x.value=value;
        }
        return x;
    }


    public String get(String key){

        Node x = root;
        while (x!=null){
            int cmp = key.compareTo(x.key);
            if(cmp<0){
                x=x.left;
            }else if(cmp>0){
                x=x.right;
            }else if(cmp==0){
                return x.value;
            }
        }
        return null;
    }

    private class Node{

        private String key;
        private String value;
        private Node left;
        private Node right;

        public Node(String key, String value){
            this.key=key;
            this.value=value;
        }
    }
}