import java.util.*;

public class sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.print("The sum of two numbers is: ");
        System.out.print(sum);
        sc.close();
    }
}