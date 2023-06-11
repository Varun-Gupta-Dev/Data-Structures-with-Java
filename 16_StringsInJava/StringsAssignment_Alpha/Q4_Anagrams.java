package StringsAssignment_Alpha;
import java.util.*;

public class Q4_Anagrams {

    // Function to calculate frequency of character
    public static int freq(String str, char ch){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    public static boolean isAnagrams(String str1, String str2){
        for(int i=0; i<str1.length(); i++){
            for(int j=0; j<str2.length(); j++ ){
                if(str1.charAt(i) == str2.charAt(j)){

                    int count1 = freq(str1,str1.charAt(i));
                    int count2 = freq(str2,str2.charAt(j));
                    if(count1 != count2){
                        return false;
                    }
                    break;
                }
                else if(j==str2.length()-1 && str2.charAt(j) != str1.charAt(i)){
                    return false;
                }
            
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        System.out.println(isAnagrams(str1,str2));
    }
}
// Refer the official solution from alpha pdf also.
