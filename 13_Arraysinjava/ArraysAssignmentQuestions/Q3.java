import java.util.*;
import java.util.Formatter.BigDecimalLayoutForm;
public class Q3 {
    public static int buysellstocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<prices.length; i++){
                if(prices[i]>buyprice){
                    int currprofit = prices[i] - buyprice;
                    maxprofit = Math.max(maxprofit,currprofit);
                }
                else{
                    buyprice = prices[i];
                }

        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[] = {7,6,4,3,1};
        System.out.println(buysellstocks(prices));
    }
}
