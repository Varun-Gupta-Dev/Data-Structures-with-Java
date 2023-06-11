

public class Q3_countInversion_BruteForce {

    public static int countInversion(int arr[]){
        int count =0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    count ++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {7,9,12,5,6,8,10};
        System.out.println(countInversion(arr));
    }
    
    
}
