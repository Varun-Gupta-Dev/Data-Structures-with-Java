import java.util.*;
public class Fibonacci_Series {
    public static int Fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1 = Fibo(n-1);
        int f2 = Fibo(n-2);
        return f1+f2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of fibonacci series: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(Fibo(i)+" ");
        }
    }
    
}
