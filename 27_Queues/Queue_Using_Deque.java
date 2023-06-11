package Queues;
import java.util.*;
public class Queue_Using_Deque {
    static class Queue{
        static Deque<Integer> deque = new LinkedList<>();

        //isEmpty
        public static boolean isEmpty(){
            return deque.isEmpty();
        }
        //add
        public static void add(int data){ // O(1)
            deque.addLast(data);
        }
        //remove
        public static int remove(){ // O(1)
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return deque.removeFirst();
        }
        //peek
        public static int peek(){ // O(1)
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return deque.getFirst();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
