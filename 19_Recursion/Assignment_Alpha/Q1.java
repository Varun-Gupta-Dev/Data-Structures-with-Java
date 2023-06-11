package Recursion.Assignment_Alpha;

public class Q1 {
    
    public static void printIndices(int arr[], int i, int key){
        if(i==arr.length){ // Base Case.
           
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        printIndices(arr,i+1,key);
    }
    public static void main(String args[]){
        int arr[] = {3,2,4,5,6,2,7,2,2};
            printIndices(arr,0,2);
    }
    
}
