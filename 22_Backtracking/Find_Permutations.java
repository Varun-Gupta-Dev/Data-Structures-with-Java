

public class Find_Permutations {
    public static void findPermutations(String str, String ans){
        // Base Case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // Recursion
        for(int i=0; i<str.length(); i++){
            
            char currchar = str.charAt(i);
            String NewStr = str.substring(0,i) + str.substring(i+1);
           
            findPermutations(NewStr,ans+currchar);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findPermutations(str,"");
    }
    
}
