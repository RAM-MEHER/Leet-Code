class Solution 
{
    public int minimumCost(int[] cost) 
    {
        Arrays.sort(cost);
        
        int minCost = 0 , size = cost.length , count = 0;
        for(int i = size-1 ; i >= 0 ; i--)
        {
            if(count == 2)
            {
                count = 0;
                continue;
            }
            else
            {
                minCost += cost[i];
                count++;
            }
        }
        return minCost;
    }
}