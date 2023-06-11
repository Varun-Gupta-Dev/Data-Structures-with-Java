package Queues;
import java.util.*;
public class Queue_Reversal {
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){ // Queue is nikal ke stack mein transfer kiya.
            s.push(q.remove());
        }
        while(!s.isEmpty()){ // Stack se nikal ke dobara Queue mein transfer kiya.
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Before reversal: ");
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverseQueue(q);
        System.out.println("After reversal: ");
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
