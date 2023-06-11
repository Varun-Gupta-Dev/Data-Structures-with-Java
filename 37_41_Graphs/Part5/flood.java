package Graphs.Part5;

public class flood {
    public static void helper(int[][] image, int sr,int sc, int color, int orgcolor){
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||image[sr][sc]
          != orgcolor){
              return;
          }
          image[sr][sc] = color;
          // left
          helper(image,sr,sc-1,color,orgcolor);
        // right
        helper(image,sr,sc+1,color,orgcolor);
        // bottom
        helper(image,sr+1,sc,color,orgcolor);
        // up
        helper(image,sc,sr-1,color,orgcolor);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
       helper(image,sr,sc,color,image[sr][sc]);
       return image; 
    }
    public static void main(String args[]){
        int image[][] ={{1,1,1},{1,1,0},{1,0,1}}; 
        int sr=1,sc=1,color=2;
        int ans[][] = floodFill(image,sr,sc,color);
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<image[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
