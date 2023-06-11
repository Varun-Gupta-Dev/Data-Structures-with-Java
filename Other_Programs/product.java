import java.util.*;

public class product{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = sc.nextFloat();

        System.out.println("Enter the second number: ");
        float b = sc.nextFloat();
        
        float product = a*b;
        System.out.println("The product of two numbers is: ");
        System.out.println(product);
        sc.close();

       }

}