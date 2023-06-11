import java.util.*;
public class SubArray_BruteForce {
    public static void printsubarr(int arr[]){
        int n = arr.length;int k;
        int size = (n*(n+1))/2; //Total no. of sub arrays.
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for( k=i; k<=j; k++){
                   System.out.print(arr[k]+" ");
                   sum = sum + arr[k];
                }
                System.out.print("(sum="+sum+")");
                //To find maximum sum
                if(sum>maxsum){
                    maxsum=sum;
                }
                //To find minimum sum
                if(sum<minsum){
                    minsum=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Sum = "+maxsum);
        System.out.println("Minimum Sum = "+minsum);
        
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        printsubarr(arr);
        
    }
}
