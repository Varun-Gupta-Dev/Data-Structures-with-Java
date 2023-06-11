import java.util.*;
public class EvenOddsum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,evsum=0,oddsum=0;
        while(true){
            System.out.println("Please enter the number: ");
            n = sc.nextInt();
            if(n%2 == 0){
                evsum += n;
            }
            else{
                oddsum += n;
            }
            System.out.println("Do you wish to continue? If Yes, enter 1, else 0. ");
            int userres = sc.nextInt();

            if(userres == 1){
                continue;
            }
            else if(userres == 0){
                break;
            }
            else{
                System.out.println("Invalid input.");
                break;
            }
        }
        System.out.println("The sum of odd numbers is : "+ oddsum);
        System.out.println("The sum of even numbers is: "+ evsum);
        sc.close();
    }
}