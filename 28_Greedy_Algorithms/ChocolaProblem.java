package Greedy_Algorithms;
import java.util.*;
public class ChocolaProblem {
    public static void main(String args[]){
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int m=4,n=6;
        int h=0,v=0,minCost=0;
        int hp=1,vp=1;

        while(v<costVer.length && h<costHor.length){
            //Vertical cut
            if(costVer[v] >= costHor[h]){
                minCost += costVer[v]*hp;
                vp++;
                v++;
            }
            //Horizontal cut
            else{
                minCost += costHor[h]*vp;
                hp++;
                h++;
            }
        }

        // For remaining cuts if any
        while(v<costVer.length){
            minCost += costVer[v]*hp;
            vp++;
            v++;
        }
        while(h<costHor.length){
            minCost += costHor[h]*vp;
            hp++;
            h++;
        }
        System.out.println("Min Cost = "+minCost);
        


    }
}
