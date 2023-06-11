package Practice;

public class _8trappingRainwater {
    public static int trapWater(int arr[]){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int tw=0;
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        // Calculation of trapped water
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(left[i],right[i]);
            tw += waterLevel-arr[i];
        }
        return tw;
    }
    public static void main(String args[]){
        int height[]  = {4,2,0,6,3,2,5};
        int water = trapWater(height);
        System.out.println("Total water trapped = "+water);
    }    
}
