import java.util.*;
public class Buy_Sell_Stocks {
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
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max Profit = "+buysellstocks(prices));
    }
}
