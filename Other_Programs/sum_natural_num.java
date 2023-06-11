import java.util.*;

public class sum_natural_num{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        int sum=0;
        int i=1;
        while(i <= range ){
            sum+=i;
            if(i<range){
                System.out.print(i + " + ");
            }
            else{
                System.out.print(i + " = ");
            }
            i+=1;
        }
        System.out.print(sum);
        sc.close();
    }
}