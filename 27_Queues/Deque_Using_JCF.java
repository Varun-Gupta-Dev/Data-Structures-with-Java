package Queues;
import java.util.*;
public class Deque_Using_JCF {
    public static void main(String args[]){
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(1);
        q.addFirst(2);
        q.addLast(3);
        q.addLast(4);
        q.removeFirst();
        q.removeLast();
        System.out.println("First element = "+q.getFirst());
        System.out.println("Last element = "+q.getLast());
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
}
