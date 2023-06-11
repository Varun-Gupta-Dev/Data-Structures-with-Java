package Part5;
import java.util.*;
public class Kruskals_Algo {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src =s;
            this.dest = d;
            this.wt = w;
        }
        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }
    public static void createGraph(ArrayList<Edge> edges){
        
        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(1,3,40));
        edges.add(new Edge(1,0,10));
        edges.add(new Edge(2,0,15));
        edges.add(new Edge(2,3,50));
        edges.add(new Edge(3,0,30));
        edges.add(new Edge(3,1,40));
        edges.add(new Edge(3,2,50));

    } 
    static int V =4;
    static int par[] = new int[V];
    static int rank[] = new int[V];

    public static void init(){
        for(int i=0; i<par.length; i++){
            par[i] = i;
        }
    }
    public static int find(int x){
        if(x == par[x]){
            return x;
        }
        return par[x] = find(par[x]);
    }
    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);
        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        } else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }else{
            par[parB] = parA;
        }
    }
    public static void kruskals(ArrayList<Edge> edges, int V){// TC = O(V + ElogE)
        init();
        Collections.sort(edges); // edges will sorted on the basis acsending weight
        int mstCount =0;
        int count = 0; // will count the number of edges.

        for(int i=0; count < V-1; i++){ // bcz there are V-1 no. of Edges for V nodes
            Edge e = edges.get(i);
            int parA = find(e.src); // a = src
            int parB = find(e.dest); // b = dest

            if(parA != parB){
                union(parA,parB);
                mstCount += e.wt;
                count++;
            }

        }
        System.out.println(mstCount);
    }
    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskals(edges, V);
    }
}
