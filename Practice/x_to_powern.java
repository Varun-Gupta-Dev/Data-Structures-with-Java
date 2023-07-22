package Practice;

public class x_to_powern {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int halfSquare = power(x,n/2);
        halfSquare = halfSquare*halfSquare;

        if(n%2 != 0){
            halfSquare = x*halfSquare;
        }
        return halfSquare;
    }
    
    public static void main(String args[]){
        
        System.out.println(power(2,10));
    }    
}
