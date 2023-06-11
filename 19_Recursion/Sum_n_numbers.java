package Recursion;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Sum_n_numbers {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String args[]){
        System.out.println(sum(5));
    }
    
}
