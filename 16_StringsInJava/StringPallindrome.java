import java.util.*;

public class StringPallindrome {
    public static void isPallindrome(String str){
        int n = str.length();
        for(int i=0; i<=n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i) ){
                System.out.println("Not a pallindrome");
                break;
            }
            else if(i==n/2){
                System.out.println("It is a pallindrome.");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        isPallindrome(str);
    }
}
