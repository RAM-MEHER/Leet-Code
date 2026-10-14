class Solution 
{

    public String maxSumOfSquares(int num, int sum) 
    {
        StringBuilder ans = new StringBuilder();
        long Sum = 0;
        for(int i = 1 ; i <= num ; i++)
        {
            Sum += 9;
            if(Sum > sum)
            {
                long excess = Sum-sum;
                Sum = sum;
                ans.append(String.valueOf(9-excess));
            }
            else
                ans.append('9');
        }
        if(Sum < sum)
            return "";
        return ans.toString();
    }
}