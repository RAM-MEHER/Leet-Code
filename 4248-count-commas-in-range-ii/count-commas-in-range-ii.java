class Solution 
{
    public long countCommas(long n) 
    {
        long ans = 0L;

        if(n < 1000)
            return 0;
        if(n > 999)
        {
            if(n < 1000000)
            {
                ans += n-999;
            }
            else
            {
                ans += 999999-999;
            }
        }
        if(n > 999999)
        {
            if(n < 1000000000L)
            {
                ans += 2*(n-999999);
            }
            else
            {
                ans += 2*(999999999-999999);
            }
        }
        if(n > 999999999)
        {
            if(n < 1000000000000L)
            {
                ans += 3*(n-999999999);
            }
            else
            {
                ans += 3*(999999999999L-999999999);
            }
        }
        if(n > 999999999999L)
        {
            if(n < 1000000000000000L)
            {
                ans += 4*(n-999999999999L);
            }
            else
            {
                ans += 4*(999999999999999L-999999999999L);
            }
        }
        if(n == 1000000000000000L)
            ans += 5;
        return ans;
    }
}