package Recursion;


public class Print_num_desc_order {
    public static void printDesc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
    
        System.out.print(n+" ");
        printDesc(n-1);
    
        
    }
    
    public static void main(String args[]){
        printDesc(10);

    }
    
}
