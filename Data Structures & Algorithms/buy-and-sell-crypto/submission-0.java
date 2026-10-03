class Solution {
    public int maxProfit(int[] prices) {


        int buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            
            buy=Math.min(buy,prices[i]);
            int check=prices[i]-buy;
            profit=Math.max(check,profit);

        }
        return profit;
       
    }
}
