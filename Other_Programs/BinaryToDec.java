import java.util.*;
public class BinaryToDec{
    public static void bintodec(int binnum){
        int Mynum = binnum;
        int pow=0;
        int dec=0;
        while(binnum>0){
            int ld = binnum%10;
            dec = dec + (int)(ld*Math.pow(2,pow));
            pow++;
            binnum/=10;
        }
        System.out.println("Decimal Equivalent of "+Mynum+"="+dec);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int binnum = sc.nextInt();
        bintodec(binnum);
        sc.close();
    }
}