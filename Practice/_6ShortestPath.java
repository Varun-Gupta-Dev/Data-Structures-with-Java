package Practice;

public class _6ShortestPath {
    public static double shortestPath(String str){
        int x1 = 0;
        int y1 = 0;
        int x = x1;
        int y = y1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'S'){
                y--;
            }else if(str.charAt(i) == 'E'){
                x++;
            }else{
                x--;
            }
        }
        return Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1, 2));
    }
    public static void main(String args[]){
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}
