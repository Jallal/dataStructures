



import java.util.Stack;

public class DepthFirstSearch {

    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    private Graph graph;
    private int v;

    public DepthFirstSearch(Graph g, int s) {

        //initialize the aries
        this.marked = new boolean[g.V()];
        this.edgeTo = new int[g.V()];

        //initialize the data structure
        this.graph = g;

        //find the vertices connected to s
        this.v = s;

        //invoke DFS
        dfs(this.graph, this.v);
    }

    public static void main(String[] args) {

        String fileName = "resources/smallGraph.txt";
        In in = new In(fileName);
        Graph G = new Graph(in);
        DepthFirstSearch dfs = new DepthFirstSearch(G, 5);

        for (int i = 0; i < dfs.edgeTo.length; i++) {

            System.out.print(dfs.edgeTo[i] + " : " + i + "\n");
        }
    }

    private void dfs(Graph graph, int v) {

        // mark the edge as visited
        marked[v] = true;

        //recursive DFS does the work
        for (int w : graph.adj(v)) {

            if (!marked[w]) {
                dfs(graph, w);
                edgeTo[w] = v;
            }
        }
    }

    public boolean hasPathTo(int v) {

        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        
        if (!hasPathTo(v)) {
            return null;
        }

        Stack<Integer> path = new Stack<Integer>();
        for (int x = 0; x != s; x = edgeTo[x]) {
            path.push(x);

        }
        path.push(s);
        return path;
    }
}


