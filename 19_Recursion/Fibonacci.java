package Recursion;

public class Fibonacci {
    public static int Fibo(int n){ // S.C = O(n)
        if(n==0||n==1){            // T.C = O(2^n)
            return n;
        }
        int f1 = Fibo(n-1);
        int f2 = Fibo(n-2);
        return f1 + f2;
    }
    public static void main(String args[]){
        System.out.println(Fibo(5));
    }
    
}
