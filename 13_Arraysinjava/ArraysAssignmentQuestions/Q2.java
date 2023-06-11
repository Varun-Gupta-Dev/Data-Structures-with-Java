import java.util.*;
public class Q2 {
    public static int search(int nums[],int target){
        // find minimum element of array
        int min = minsearch(nums);
        if( nums[min] <= target && target <= nums[nums.length-1]){
            return search(nums,min,nums.length-1,target);
        }
        else{
            return search(nums,0,min-1,target);
        }
    }

    // Binary Search
    public static int search(int nums[], int left, int right,int target){
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target ){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
    // Program to find minimum element
    public static int minsearch(int nums[]){
        int left =0;
        int right = nums.length-1;
        while(left<right){
            int mid = (left + right)/2;
            if(nums[mid] >=0 && nums[mid-1] > nums[mid]){
                return mid;
            }
            else if((nums[left] <= nums[mid]) && nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }

        }
        return left;
    }
    public static void main(String args[]){
        int nums[] = {1};
        int target = 0;
        System.out.println(search(nums,target));
    }
}
