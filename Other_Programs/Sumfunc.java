import java.util.*;
public class Sumfunc{

    public static int Calsum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();
        int sum = Calsum(a,b);   
        System.out.println(sum);
        sc.close();
    }
    
}