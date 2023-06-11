package Dynamic_Programming_Part1;
import java.util.*;
public class Q_ClimbingStairs_Memoization {
    public static int countWays(int n, int ways[]){ // TC = O(n)
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n] != -1){// Already calculated.
            return ways[n];
        } 
        ways[n] = countWays(n-1,ways) + countWays(n-2, ways);
        return ways[n];
    }
    public static void main(String args[]){
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1); // fills all indices of array with -1.
        System.out.println(countWays(n, ways));
    }
}
