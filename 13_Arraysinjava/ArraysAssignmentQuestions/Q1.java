import java.util.*;

public class Q1 {
   public static boolean repeatingnum(int nums[]){
      for(int i=0; i<nums.length-1; i++){
         for(int j=i+1; j<nums.length; j++){

            if(nums[i] == nums[j]){
            
               return true;
            }
         }
         
      }
      return false;
   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements you want enter: ");
    int num = sc.nextInt();
    
    int nums[] = new int[num];
    for(int i=0; i<num; i++){
         nums[i] = sc.nextInt();
    }
    System.out.println(repeatingnum(nums));
   } 
}
