package Trials.Graphs;
import java.util.ArrayList;
import java.util.List;

public class DFS {

    public void dfs(int start, List<List<Integer>> adjList, List<Integer> ls, boolean[] visited){

        visited[start] = true;
        ls.add(start);
        List<Integer> nodes = adjList.get(start);
        for(int node : nodes){
            if(!visited[node]){
            dfs(node, adjList, ls, visited);
        }
    }
    }
    
    public List<Integer> dfsTraversal(List<List<Integer>> adjList, int V){

        List<Integer> ls = new ArrayList<>();

        boolean[] visited = new boolean[V];

        dfs(0, adjList, ls, visited);

        return ls;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<>());
        }

        // System.out.println(adjList);

        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(2).add(0);
        adjList.get(2).add(3);
        adjList.get(2).add(4);
        adjList.get(3).add(2);
        adjList.get(4).add(2);
        
        // System.out.println(adjList);

        DFS dfs = new DFS();

        List<Integer> result = dfs.dfsTraversal(adjList, 5);

        System.out.println(result);        
    }
}
