package Greedy_Algorithms;
import java.util.*;
public class ActivitySelection_Unsorted {
    public static void main(String args[]){
        int start[] = {0,1,3,5,5,8}; // Activities are sorted accrding to start time
        int end[] = {6,2,4,7,9,9};  // so we need to sort it accrding to end time
        ArrayList<Integer> ans = new ArrayList<>();
        //Sorting accrding to end time;
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //Lambda function-->short form of big function(Comparator)
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));/*Syntax for 
        sorting 2-D arrays. 
        Comparators are functions that define the logic for sorting i.e how sorting is 
        to be done. */
        int maxAct =0;

        // Select first activity
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<end.length; i++){
            if(activities[i][1] >= lastEnd){
                //Select activity
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("Max Activities = "+maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
