import java.util.*;
public class FloydTriang{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int row = sc.nextInt();
    int counter = 1;
    int i;
    for ( i=1; i<=row; i++){
        for(int j=1; j<=i; j++){
            
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
    sc.close();
    
    }
}