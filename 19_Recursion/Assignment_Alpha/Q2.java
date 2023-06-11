package Recursion.Assignment_Alpha;

public class Q2 {
    public static void convertNumToWords(int n){
        String wordsarr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n == 0){
            return;
        }
        convertNumToWords(n/10);
        int currnum = n%10;
        System.out.print(wordsarr[currnum]+" ");
    }
    public static void main(String args[]){
        convertNumToWords(1947);
    }
    
}
