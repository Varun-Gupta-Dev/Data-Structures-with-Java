import java.util.*;
public class fact{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial needs to be calculated: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;

        }
        System.out.println(n+"!"+" = " + fact);
        sc.close();
    }
}