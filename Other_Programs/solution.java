import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temp.");
        float temp = sc.nextFloat();
        if (temp > 100){
            System.out.println("You have fever.");

        }
        else if(temp <=100){
            System.out.println("You don't have fever.");
        }
        sc.close();
    }
}