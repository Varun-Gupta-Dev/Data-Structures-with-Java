import java.util.*;
public class Avg_using_method {
    public static float avg(float a, float b, float c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = sc.nextInt();
        System.out.println("Enter the second number: ");
        float b = sc.nextInt();
        System.out.println("Enter the third number: ");
        float c = sc.nextInt();

        System.out.println(avg(a,b,c));
    
    sc.close();
    }
}
