import java.util.*; //Package is imported

public class input_in_java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.print(name);
        System.out.println("Enter the boolean value of a: ");
        boolean a = sc.nextBoolean();
        System.out.print(a);
        sc.close();

    }
}