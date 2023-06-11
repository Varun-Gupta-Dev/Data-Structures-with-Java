package StringsAssignment_Alpha;
import java.util.*;

public class Q1 {
    public static int countvowels(String str){
        int count =0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();
        System.out.println("Number of lowercase vowels = "+countvowels(str));

    }
}
