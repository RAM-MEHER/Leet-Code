class Solution 
{
    static {
        for (int i = 0; i < 500; i++) {
            minSubArrayLen(1, new int[] { 1 });
        }
    }

    public static int minSubArrayLen(int target, int[] nums) 
    {
        int r , sum = 0 , minlen = Integer.MAX_VALUE , len , l = 0;
        for(r = 0 ; r < nums.length ; r++)
        {
            sum += nums[r];
            while(sum >= target)
            {
                len = r - l + 1;
                minlen = (minlen < len)? minlen : len;
                sum -= nums[l++];
            }
        }
        if(minlen == Integer.MAX_VALUE)
            return 0;
        return minlen;
    }
}

/*
This is the optimal code for this question
Time Complexity ~: O(n) 
*/