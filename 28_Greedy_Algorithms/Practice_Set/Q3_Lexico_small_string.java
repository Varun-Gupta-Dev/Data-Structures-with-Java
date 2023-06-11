package Greedy_Algorithms.Practice_Set;

public class Q3_Lexico_small_string {
//    public static String smallestString(int N, int K){
//
//    }
    public static void main(String args[]){
        char arr[]=new char[26];
        char ch='a';
        for(int i=0; i<arr.length; i++){
            arr[i] = ch++;
        }
        System.out.println(arr[25]);
    }
}
