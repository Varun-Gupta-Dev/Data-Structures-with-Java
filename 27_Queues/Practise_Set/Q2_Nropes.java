import java.util.*;
public class Q2_Nropes{
    public static int nRopes(int arr[]){ // T.C = O(nlogn)+O(n)
                                         // S.C = O(n)   
        Arrays.sort(arr);
        Queue<Integer> q = new LinkedList<>();
        int sum=arr[0]+arr[1];
        q.add(sum);
        for(int i=2; i<arr.length; i++){
            sum = sum+arr[i];
            q.add(sum);
        }
        int mincost=0;
        while(!q.isEmpty()){
             mincost = mincost+q.remove(); 
        }
        return mincost;
    }
    public static void main(String args[]){
        int arr[]= {1,2,3};
        System.out.println(nRopes(arr));
    }
}