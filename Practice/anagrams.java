package Practice;

import java.util.*;



public class anagrams {
    public static boolean isAnagram(String str1, String str2){
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    if(str1.length() != str2.length()){
        return false;
    }else{
        char str1Arr[] = str1.toCharArray();
        char str2Arr[] = str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        if(Arrays.equals(str1Arr,str2Arr)){
            return true;
        }

    }
    return false; 
    
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        if(isAnagram(str1,str2)){
            System.out.println("Two strings are anagrams");
        }else{
            System.out.println("Strings are not anagrams.");
        }
    }    
}
