package Recursion;

public class Friends_Pairing {
    public static int friendsPairing(int n){
        if(n==1 || n==2){// ---> Base Case
            return n;
        }

        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    public static void main(String arsg[]){
        System.out.println(friendsPairing(3));
    }
}
