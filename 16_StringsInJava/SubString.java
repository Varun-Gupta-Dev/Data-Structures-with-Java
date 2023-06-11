package StringsInJava;
import java.util.*;

public class SubString {
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;

    }                                                          //si=Starting index
                                                               //ei=Ending index(Non inclusive)
                                                              
    public static void main(String args[]){
        String str = "HelloWorld";
        //System.out.println(subString(str,0,5));

        // java also have an inbuilt function for finding substring.
        System.out.println(str.substring(0,5));//inbuilt func.
    }
    
}


