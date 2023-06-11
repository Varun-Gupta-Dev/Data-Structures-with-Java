package Assignment_alpha;

public class _Q1 {

    public static int freq(int arr[][],int key){ // Linear Search
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==key){
                    count++;
                }
            }

        }
        return count;
    }

    
    public static void main(String args[]){
        int arr[][] = {{4,7,8},{8,8,7}};
        // System.out.println(freq1(arr,7));
        System.out.println(freq(arr,7));

    }  
}
