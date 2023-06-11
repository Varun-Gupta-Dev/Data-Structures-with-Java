package Recursion;

public class TilingProblem {
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //Vertical Choice
        int nm1 = tiling(n-1);

        //Horizontal Choice
        int nm2 = tiling(n-2);
        int totways = nm1 + nm2;
        return totways;

    }
    public static void main(String args[]){
        System.out.print(tiling(4));
    }
    
}
