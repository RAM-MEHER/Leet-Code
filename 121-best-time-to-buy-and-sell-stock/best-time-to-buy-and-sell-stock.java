class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int len = prices.length , profit = 0 , minRate = Integer.MAX_VALUE;

        for(int val : prices)
        {
            if(val < minRate)
                minRate = val;
            else
                profit = Math.max(profit , (val-minRate));
        }
        return profit;
    }
}