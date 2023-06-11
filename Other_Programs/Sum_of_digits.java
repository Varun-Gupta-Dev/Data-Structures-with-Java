import java.util.*;
public class Sum_of_digits {
    public static int digitsum(int n){
        int sum=0;
        while(n>0){
            int ld = n%10;
            sum += ld;
            n/=10;
        }
        return  sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The sum of digits of the given number ="+digitsum(n));
        sc.close();
        
    }

}


    
