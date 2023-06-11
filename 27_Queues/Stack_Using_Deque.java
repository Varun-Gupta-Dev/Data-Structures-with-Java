package Queues;
import java.util.*;
public class Stack_Using_Deque {
    static class Stack{
        static Deque<Integer> deque = new LinkedList<>();
        
        //isEmpty
        public static boolean isEmpty(){ //O(1)
            return deque.isEmpty();
        }
        //push
        public static void push(int data){ // O(1)
            deque.addLast(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty.");
                return -1;
            }
            return deque.removeLast();
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty.");
                return -1;
            }
            return deque.getLast();
        }

    }
    public static void main(String args[]){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
