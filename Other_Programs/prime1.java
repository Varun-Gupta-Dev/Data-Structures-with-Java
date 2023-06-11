import java.util.*;
public class prime1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        boolean isprime = true;
        if(num ==2 ){
            System.out.println(num + " is prime.");
        }
        else{
        for(int i=2; i<=num-1; i++){
            if(num%i == 0){ 
               
               isprime = false; 
            }

        }
        if(isprime == true){
            System.out.println(num + " is prime.");
        }
        else if(isprime == false){
            System.out.println(num + " is not prime.");
        }
        }
        sc.close();

    }
}