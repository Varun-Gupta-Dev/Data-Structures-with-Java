package Greedy_Algorithms;

import java.util.*;
public class Fractional_Kanpsack {

    public static void main(String args[]){
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W=50;
        double items[][] = new double[value.length][2];

        for(int i=0; i<value.length; i++){
            items[i][0]=i;
            items[i][1] = (double)value[i]/weight[i]; //--> Ratio
        }
        //Sorting on the basis of ratio
        Arrays.sort(items,Comparator.comparingDouble(o -> o[1]));/*Sorted in ascending 
        order of ratio */
        int capacity=W;
        double maxVal=0;
        for(int i=value.length-1; i>=0; i--){
            int idx = (int)items[i][0];
            if(capacity>=weight[idx]){
                //Add item
                capacity -= weight[idx];
                maxVal += value[idx];
            }
            else{
                //Include fractional item.
                maxVal += capacity*items[i][1];
                capacity=0;
                break;
            }
        }
        System.out.println("Maximum Value = "+maxVal);
    }
}
