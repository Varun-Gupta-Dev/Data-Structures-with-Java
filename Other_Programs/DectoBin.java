import java.util.*;

public class DectoBin {
    public static int dectobin(int n ){
        int bin =0;
        int pow=0;
        while(n>0){
            int rem = n%2;
            bin = bin + rem*(int)Math.pow(10,pow);
            n/=2;
            pow++;
        }
        return bin;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n = sc.nextInt();
        System.out.println("The binary equivalent of the given decimal number ="+dectobin(n));
    sc.close();
    }
    
}
