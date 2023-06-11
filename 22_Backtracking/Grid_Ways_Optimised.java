import java.util.*;
public class Grid_Ways_Optimised {

    public static int gridWays(int rows, int cols){// T.C = O(n+m)

        return (fact(rows+cols-2))/((fact(rows-1))*(fact(cols-1)));
    }

    public static int fact(int n){
        // Base case
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Enter no.of Rows: ");
        n = sc.nextInt();
        System.out.println("Enter no.of Columns: ");
        m = sc.nextInt();
        System.out.println("Total no.of ways = "+gridWays(n,m));
        
    }
    
}
