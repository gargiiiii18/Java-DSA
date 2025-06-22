package Trials.Graphs;

public class AdjacencyMatrix {

    public static int[][] constructMatrix(int[][] edges){
        int[][] adjList = new int[edges.length][edges.length];

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

                adjList[u][v] = 1;
                adjList[v][u] = 1;
        }
        return adjList;
    }

    public static void main(String[] args){
        int[][] edges = {{0, 3}, {0, 1}, {3, 2}, {1, 2}};
        int[][] matrix = constructMatrix(edges);

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
