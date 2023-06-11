package Recursion.Assignment_Alpha;

public class Q4 {
    public static int count =0;
    public static int count(String str, int i,int j){
        
        if(i==str.length()-1){
            return count;
        }
        if(str.charAt(i) == str.charAt(j)){
            count++;
        }
        if(j == str.length()){
            i++;
            j=i-1;
        }
        count(str,i,j+1);
        return count;
       
    }
    public static void main(String args[]){
        System.out.println(count("abcab",0,0));

    }    
}
