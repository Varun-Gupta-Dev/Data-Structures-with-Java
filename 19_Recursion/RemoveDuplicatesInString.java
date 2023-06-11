import java.util.*;


public class RemoveDuplicatesInString {
    public static void removeDuplicates(String str, int i, StringBuilder newstr, boolean map[]){
        if(i == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(i);
        if(map[currchar - 'a'] == true){
            //Duplicates present
            removeDuplicates(str,i+1,newstr,map);
        }
        else{
            map[currchar-'a'] = true;
            removeDuplicates(str,i+1,newstr.append(currchar),map);
        }

    }

    public static void main(String args[]){
        String str = "appnacollege";
        
        removeDuplicates(str,0,new StringBuilder(""), new boolean[26]);

    }
    
}
