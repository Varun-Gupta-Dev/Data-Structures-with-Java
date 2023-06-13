package Practice;

import java.util.*;

public class countLowerCaseVowels {
    public static int countVowels(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')&&Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();
        int count = countVowels(str);
        System.out.println("No. of lower case vowels are: "+count);

    }
}
