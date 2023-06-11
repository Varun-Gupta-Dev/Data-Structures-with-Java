package Greedy_Algorithms;
import java.util.*;
public class Indian_Coins {
    public static void main(String args[]){
        int coins[] = {1,2,5,10,20,100,500,2000};//Already Sorted
        int V=1249;
        ArrayList<Integer> ans = new ArrayList<>();
        int count =0;
        for(int i=coins.length-1; i>=0; i--){
            if(coins[i]<=V){
                while(coins[i]<=V){
                count++;
                ans.add(coins[i]);
                V -= coins[i];
                }
            }
        }
        System.out.println("Min no. of coins = "+count);
        System.out.print("(");
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println(")");
    }
}
