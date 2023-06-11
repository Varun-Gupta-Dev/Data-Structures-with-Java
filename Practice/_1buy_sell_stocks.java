package Practice;

public class _1buy_sell_stocks {
    public static int stocksMaxProfit(int prices[]){
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<n; i++){
            if(prices[i]>buyPrice){
                int currprofit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, currprofit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        int mProfit = stocksMaxProfit(prices);
        System.out.println("Max profit = "+mProfit);
    }    
}
