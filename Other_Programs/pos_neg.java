import java.util.*;

public class pos_neg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if(num<0){
            System.out.print("The number is negative.");

        } 
        else if(num>0){
            System.out.println("The number is positive.");

        }
        else{
            System.out.println("The number is neither positive nor negative.");
        }
        sc.close();
    }
}