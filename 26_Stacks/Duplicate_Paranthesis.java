import java.util.*;
public class Duplicate_Paranthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            // Closing condition
            if(ch == ')'){
                int count =0;
                while(s.pop() != '('){
                    count++;
                }
                if(count ==0){
                    return true;
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "(a+b)";
        System.out.print(isDuplicate(str));
    }
}
