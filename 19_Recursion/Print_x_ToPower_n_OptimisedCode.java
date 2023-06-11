package Recursion;

public class Print_x_ToPower_n_OptimisedCode {
    public static int optimisedPower(int x, int n){
        if(n==0){
            return 1;
        }
        //int halfSquare = optimisedPower(x,n/2)*optimisedPower(x, n/2);//With this statement T.C still remains O(n).
        int halfSquare = optimisedPower(x, n/2);
        halfSquare = halfSquare*halfSquare;

        if(n%2 != 0){
            halfSquare = x*halfSquare;
        }
        return halfSquare;
    }
    public static void main(String args[]){
        System.out.println(optimisedPower(2,10));

    }
    
}
