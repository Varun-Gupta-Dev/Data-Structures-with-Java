public class Q3_Knights_Tour {
    static int N = 4;
    public static boolean isSafe(int x, int y, int sol[][]){
        return (x >= 0 && y>=0 && x<N && y<N && sol[x][y] == -1);
    }
    public static boolean solveKT(){
        int sol[][] = new int [N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sol[i][j] = -1;
            }
        }

        int xmove[] = {2,1,-1,-2,-2,-1,1,2};
        int ymove[] = {1,2,2,1,-1,-2,-2,-1};

        sol[0][0] = 0;
        
        if(!solveKTUtil(0,0,1,sol,xmove,ymove)){
            System.out.println("Solution does not exists.");
            return false;
        }
        else{
            printSolution(sol);
            return true;
        }
    }
    public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xmove[],
    int ymove[]){
        int next_x, next_y,k;
        // Base condition
        if(movei == N*N){
            return true;
        }

        for(k=0; k<8; k++){
            next_x = x + xmove[k];
            next_y = y + ymove[k];
            if(isSafe(next_x,next_y,sol)){
                sol[next_x][next_y] = movei;
                if(solveKTUtil(next_x,next_y,movei+1,sol,xmove,ymove)){
                    return true;
                }
                else{
                    sol[x][y] = -1; // Backtracking step
                }
            }
        }
        return false;
    }
    public static void printSolution(int sol[][]){
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol[0].length; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        solveKT();
    }    
}
