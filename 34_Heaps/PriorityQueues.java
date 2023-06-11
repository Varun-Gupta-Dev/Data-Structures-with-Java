import java.util.*;

public class PriorityQueues {
    
    public static void main(String args[]){
     PriorityQueue<Integer> pq = new PriorityQueue<>();// By default gives priority to minimum element
    // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//Logic reversed,now gives 
    // priority to maximum element.
        pq.add(3);
        pq.add(6);
        pq.add(1);
        pq.add(2);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
