import java.util.*;
public class NearbyCars {
    static class Cars implements Comparable<Cars>{
        int x;
        int y;
        int dist;
        int idx;
        Cars(int x, int y, int dist, int idx){
            this.x=x;
            this.y=y;
            this.dist=dist;
            this.idx=idx;
        }
        @Override
        public int compareTo(Cars c2){
            return this.dist - c2.dist;
        }
    }
    public static void main(String args[]){
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Cars> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int dist = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Cars(pts[i][0],pts[i][1],dist,i));
        }
        for(int i=0; i<k; i++){
            System.out.print("C"+pq.remove().idx+" ");
        }

    }
}
