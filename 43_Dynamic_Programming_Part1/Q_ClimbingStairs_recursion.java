package Dynamic_Programming_Part1;

public class Q_ClimbingStairs_recursion {
    public static int countWays(int n){ // TC = O(2^n)
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return countWays(n-1) + countWays(n-2);
    }
    public static void main(String args[]){
        int n = 10;
        System.out.println(countWays(n));
    }
}
