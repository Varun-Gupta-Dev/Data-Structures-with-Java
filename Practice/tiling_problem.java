package Practice;

public class tiling_problem {
    public static int tilingWays(int n){
        if(n==0 || n==1){    // Base case
            return 1;
        }
        // Place vertically
        int w1 = tilingWays(n-1);

        // PLace horizontally
        int w2 = tilingWays(n-2);

        return w1+w2;
    }
    public static void main(String args[]){
        System.out.println(tilingWays(3));
    }    
}
