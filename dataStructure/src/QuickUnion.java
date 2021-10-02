public class QuickUnion {

    private int[] id;

    /**
     * set id of each object to itself (N array accesses)
    * */
    public QuickUnion(int n) {

        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    /**
     * Chase parent pointer until reach root (depth of i array accesses)
     * */
    private int root(int i) {

        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    /**
     * Check if p and q have same root (depth of p and q array accesses)
     * */
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    /**
     * Change root of p to point to the root q (depth pf p and q array accesses)
     * */
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

}
