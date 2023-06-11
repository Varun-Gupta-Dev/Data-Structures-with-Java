
public class FloodFillAlgo {
    public static void helper(int image[][], int sr, int sc, int color,int orgcolor){ // TC = O(m*n)
        
        if(sc<0 || sr<0 || sc>=image[0].length || sr>=image.length || image[sr][sc] != orgcolor){
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
    public static int[][] floodFill(int image[][], int sr, int sc, int color){ // TC = O(1)
        // boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color,image[sr][sc]);

        return image;
    }
    public static void main(String args[]){
        int image[][] = {{1,1,1},
                         {1,1,0},
                         {1,0,1}};
        int sr=1, sc=1,color=2;

        int ans[][] = floodFill(image,sr,sc,color);

        
        System.out.println(ans);
    }
}
