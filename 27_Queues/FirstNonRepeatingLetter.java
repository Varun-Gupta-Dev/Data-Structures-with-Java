package Queues;
import java.util.*;
public class FirstNonRepeatingLetter { // T.C=O(n)
    public static void printFirstNonRepeating(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{ //--> frequency of a character =1
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String args[]){
        String str = "aabccxb";
        printFirstNonRepeating(str);
    }
}
