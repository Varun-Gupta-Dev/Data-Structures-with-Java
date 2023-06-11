import java.util.*;

public class Q2_KeypadCombinations {
    public static void keypadComb(String digits) {
        String arr[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "wxyz" };
        if (digits.length() == 1) {
            int digit = Character.getNumericValue(digits.charAt(0));
            for (int i = 0; i < arr[digit].length(); i++) {
                System.out.print(arr[digit].charAt(i) + " ");
            }
            return;
        } else if (digits.length() == 0) {
            System.out.println("&");
            return;
        }
        int digit1 = Character.getNumericValue(digits.charAt(0));
        int digit2 = Character.getNumericValue(digits.charAt(1));
        for (int i = 0; i < arr[digit1].length(); i++) {
            for (int j = 0; j < arr[digit2].length(); j++) {
                System.out.print(arr[digit1].charAt(i));
                System.out.print(arr[digit2].charAt(j));
                if (i == arr[digit1].length() - 1 && j == arr[digit2].length() - 1) {
                    System.out.print("");
                } else {
                    System.out.print(",");
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits: ");
        String digits = sc.next();
        keypadComb(digits);

    }
}
