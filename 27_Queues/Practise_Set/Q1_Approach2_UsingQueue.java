package Queues.Practise_Set;
import java.util.*;
public class Q1_Approach2_UsingQueue {
    public static int decToBin(int n){
        int bin=0;
        int pow=0;
        while(n>0){
            int rem = n%2;
            bin = bin + rem*(int)Math.pow(10,pow);
            n/=2;
            pow++;
        }
        return bin;
    }
    public static void printBin(int n){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            int bin = decToBin(i);
            q.add(bin);
        }
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
    public static void main(String args[]){
        printBin(5);
    }
}
