package Assignment_alpha;

public class Q1_MyCode {
    public static void solveMaze(int maze[][]){
        int sol[][] = new int[maze.length][maze[0].length];
        sol[maze.length-1][maze[0].length-1]=1;
        findPath(0,0,maze,sol);
    }
    public static void findPath(int i, int j, int maze[][], int sol[][]){
        sol[maze.length-1][maze[0].length-1]=0;
        // Base Case
        if(i==maze.length-1 && j==maze.length-1){
            sol[i][j]=1;
            printSol(sol);
            System.out.println();
            return;
        }
        if(i==maze.length || j==maze[0].length){
            return;
            
        }
        // Downwards
        if(isSafe(i,j,maze)){
            sol[i][j] =1;
            findPath(i+1,j,maze,sol);
           
        }
        // Rightwards
        if(isSafe(i,j,maze)){
            sol[i][j] =1;
            findPath(i,j+1,maze,sol);
            
        }
        sol[i][j]=0;
        // Upwards
        // if(isSafe(i,j,maze)){
        //     sol[i][j] =1;
        //     findPath(i-1,j,maze,sol);
        // }
        // sol[i][j]=0;
        // // leftwards
        // if(isSafe(i,j-1,maze)){
        //     sol[i][j-1] =1;
        //     findPath(i,j-1,maze,sol);
        // }

    }
    public static boolean isSafe(int i, int j, int maze[][]){
        return(i>=0 && j>=0 && i< maze.length && j<maze[0].length 
                && maze[i][j] == 1);
    }
    public static void printSol(int sol[][]){
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol[0].length; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int maze[][] = {{1,1,1,1},
                        {1,1,0,1},
                        {0,1,0,1},
                        {1,1,1,1}};
        solveMaze(maze);
    }
    
}
