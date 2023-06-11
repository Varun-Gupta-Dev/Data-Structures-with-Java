import java.util.*;
public class _Q2 {
    public static int rowSum(int nums[][], int row){
        int sum=0;
        for(int j=0; j<nums[0].length; j++){
            sum+=nums[row][j];
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int row  = sc.nextInt();
        System.out.println(rowSum(nums,row));

    }
}
