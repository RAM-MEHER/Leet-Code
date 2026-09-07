class Solution 
{
    public int countGoodRotations(int[] nums) 
    {
        int len = nums.length , ans = 0 , l = 0 , r = len/2;
        long lh = 0 , rh = 0;
        for(int i = 0 ; i < len/2 ; i++)
        {
            lh += nums[i];
            rh += nums[len-i-1];
        }

        for(int i = 0 ; i < len/2 ; i++)
        {
            if(lh < rh || rh < lh)
                ans++;
            lh = lh - nums[l] + nums[r];
            rh = rh - nums[r++] + nums[l++];
        }
        return ans;
    }
}