package Practise_Set;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class priorityQueue {
    public static void main(String args[]){
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(15);
        q.add(12);
        q.add(20);
        q.add(16);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
/*  In priority queue elements are stored on the basis of their priority that in
ascending order*/