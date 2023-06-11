import java.util.*;


public class Q1 {
    public static void main(String args[]){
        float a, b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first complex number: ");
        System.out.print("Enter the real part: ");
        a = sc.nextFloat();
        System.out.print("Enter the imaginary part: ");
        b = sc.nextFloat();
        System.out.println("Enter the second complex number: ");
        System.out.print("Enter the real part: ");
        c = sc.nextFloat();
        System.out.print("Enter the imaginary part: ");
        d = sc.nextFloat();

        Complex c1 = new Complex();
        c1.sum(a,b,c,d);
        c1.difference(a,b,c,d);
        c1.multiply(a,b,c,d);

    }
    
}

class Complex{
    void sum(float a, float b, float c, float d){

        float realpart = a+c;
        float imgpart = b+d;
        System.out.println("Sum = "+realpart+" + "+imgpart+"i");
    }

    void difference( float a, float b, float c, float d){
        float realpart = a-c;
        float imgpart = b-d;
        System.out.println("Difference = "+realpart+" + "+imgpart+"i");
    }

    void multiply(float a, float b, float c, float d){
        float realpart = (a*c - b*d);
        float imgpart = (a*d + b*c);
        System.out.println("Multiplication = "+realpart+" + "+imgpart+"i");
    }
}
