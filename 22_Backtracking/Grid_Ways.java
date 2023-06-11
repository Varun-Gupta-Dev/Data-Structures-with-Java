public class Grid_Ways {

    public static int gridWays(int i, int j, int row, int col){ // T.C=O(2^(n+m))
        // Base Case
        if(i==row-1 && j==col-1){
            return 1;
        }else if(i==row || j==col){
            return 0;
        }

        int w1 = gridWays(i+1,j,row,col);
        int w2 = gridWays(i,j+1,row,col);
        return w1+w2;
    }
    public static void main(String args[]){
        int n=3;
        int m=3;
        System.out.println(gridWays(0,0,n,m));
    }
    
}
