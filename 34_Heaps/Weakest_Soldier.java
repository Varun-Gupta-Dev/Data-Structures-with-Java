import java.util.*;
public class Weakest_Soldier {
    static class Row implements Comparable<Row>{
        int soldier;
        int idx;
        Row(int soldier, int idx){
            this.soldier = soldier;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soldier == r2.soldier){
                return this.idx - r2.idx;
            }
            else{
                return this.soldier - r2.soldier;
            }
        }
    }
    public static void main(String args[]){
        PriorityQueue<Row> pq = new PriorityQueue<>();
        int k=2;
        int army[][] = {   {1,0,0,0},
                           {1,1,1,1},
                           {1,0,0,0},
                           {1,0,0,0}};
        
        for(int i=0; i<army.length; i++){
            int count =0;
            for(int j=0; j<army[0].length; j++){
                count += army[i][j] == 1 ? 1:0;
            }
            pq.add(new Row(count,i));
        }
        for(int i=0; i<k; i++){
            System.out.println("R"+pq.remove().idx);
        }
    }
}
