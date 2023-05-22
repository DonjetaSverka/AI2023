import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
    private List<Integer>[] graph;
    private boolean[] visited;


    public DepthFirstSearch(int numVertices) {
        graph = new List[numVertices];
        visited = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            graph[i] = new ArrayList<>();
        }
    }


    public void addEdge(int u, int v) {
        graph[u].add(v);
        graph[v].add(u);
    }



    public void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");


        for (int n : graph[v]) {
            if (!visited[n]) {
                dfs(n);
            }
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch dfs = new DepthFirstSearch(5);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(2, 4);


        dfs.dfs(0);
    }
}
