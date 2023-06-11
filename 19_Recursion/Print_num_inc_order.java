package Recursion;

public class Print_num_inc_order {
    public static void printInc(int n){ //T.C = O(n)
                                        ///S.C = O(n)
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }
    public static void main(String args[]){
        printInc(10);
    }
    
}
