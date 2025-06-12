class Solution 
{
    public int maxAdjacentDistance(int[] nums) 
    {
        int max_diff = Math.abs(nums[0] - nums[nums.length-1]);

        if(nums.length == 2)
            return Math.abs(nums[0] - nums[1]);
        else
        {
            for(int i = 0 ; i < nums.length-1 ; i++)
                if(Math.abs(nums[i] - nums[i+1]) > max_diff)
                    max_diff = Math.abs(nums[i] - nums[i+1]);
        }
        return max_diff;
    }
}