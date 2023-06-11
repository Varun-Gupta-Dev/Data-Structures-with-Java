package Recursion;

public class Binary_String_Problem {
    public static void printbinaryString(int n, int lastplace, String str){
        if(n==0){ // Base Case
            System.out.println(str);
            return;
        }

        printbinaryString(n-1,0,str+"0");

        if(lastplace==0){
            printbinaryString(n-1,1,str+"1");
        }

    }
    public static void main(String args[]){
        printbinaryString(3,0,"");

    }
    
}
