

public class Find_Subsets {
    public static void findSubsets(String str, String ans, int i ){
        // Base Case
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.print("NULL");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        // Recursion
        // Yes choice
        findSubsets(str,ans+str.charAt(i),i+1);

        // No Choice
        findSubsets(str,ans,i+1);
    }
    public static void main(String rgs[]){
        String str = "abc";
        findSubsets(str,"",0);
    }
    
}
