package Day_1;

public class LC_121_Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maximumProfit(prices));
    }

    static int maximumProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
}
