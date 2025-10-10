package Trials.Graphs;

import java.util.*;

public class BFS {
    
    public List<Integer> bfsTraversal(List<List<Integer>> adjList, int start){

        // System.out.println(V+1);
        boolean[] visited = new boolean[adjList.size()];
        List<Integer> bfs = new ArrayList<>();

        Deque<Integer> q = new ArrayDeque<>();

        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int curr = q.poll();
            // System.out.print(curr + " ");
            bfs.add(curr);

            List<Integer> nodes = adjList.get(curr);
            
            for(Integer node : nodes){
                if(!visited[node]){
                    q.add(node);
                    visited[node] = true;
                }
            }
        }
        return bfs;
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

        BFS bfs = new BFS();

        List<Integer> result = bfs.bfsTraversal(adjList, 0);

        System.out.println(result);
    }


}
