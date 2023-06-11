package Queues.Practise_Set;

public class Q1_Approach1 {
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
        for(int i=1; i<=n; i++){
            System.out.print(decToBin(i)+" ");
        }
    }
    public static void main(String args[]){
        printBin(5);
    }
}
