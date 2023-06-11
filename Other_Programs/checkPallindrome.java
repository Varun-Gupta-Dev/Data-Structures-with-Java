import java.util.*;
public class checkPallindrome {
    public static boolean isPallindrome(int n){
        int Mynum = n;
        int rev=0;

        while(n>0){
            int ld = n%10;
            rev = rev*10 + ld;
            n/=10;
        }
        if(Mynum == rev){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = sc.nextInt();
        System.out.println(isPallindrome(n));
        sc.close();
    }
}