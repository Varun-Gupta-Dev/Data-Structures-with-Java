package Practice;

import java.util.Scanner;

public class _7StringPalindrome {
    public static boolean palindrome(String str){
        int n = str.length();
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = sc.nextLine();
        if(palindrome(str)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
