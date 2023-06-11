public class Nqueens_printOneSolution{

    public static boolean isSafe(char board[][], int row, int col){
        // Vertically Upwards
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Diagonally Left Up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Diagonally right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("------Chess Board------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean nQueens(char board[][], int row){
        // Base Case
        if(row==board.length){
            // printBoard(board);
            return true;
        }
        //Recursion
        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){

                board[row][j] = 'Q';
                if(nQueens(board,row+1)){
                    return true;
                } // Function Call
                board[row][j] = 'x'; // Backtracking Step
            }
        }
        return false;
        
    }
    public static void main(String args[]){
        int n=4;
        char board[][] = new char[n][n];
        //Initialisation
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                board[i][j] = 'x';
            }
        }
        if(nQueens(board,0)){
            System.out.println("Solution is possible.");
            printBoard(board);
        }
        else{
            System.out.println("Solution is not possible.");
        }
    }
}