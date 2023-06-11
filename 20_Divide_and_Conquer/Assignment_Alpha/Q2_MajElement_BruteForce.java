

public class Q2_MajElement_BruteForce {
    public static int majElement(int nums[]){
        int majCount = nums.length/2;
        for(int i=0; i<nums.length; i++){
            int count =0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] == nums[i]){
                    count+=1;
                }
            }
            if(count>=majCount){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {3,3,3,2,2,2};
        System.out.print(majElement(nums));
    }
    
}
