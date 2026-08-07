class Solution 
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        int len = nums.length , left = 0 , right = 1 , min = Integer.MAX_VALUE , sum = nums[0];

        while(right < len)
        {
            while(left <= right && sum >= target)
            {
                min = Math.min(min , (right-left));
                sum -= nums[left++];
            }
            if(left > right)
            {
                right = left;
            }
            sum += nums[right++];
        }
        while(left <= right && sum >= target)
        {
            min = Math.min(min , (right-left));
            sum -= nums[left++];
        }
        if(min != Integer.MAX_VALUE)
            return min;

        return 0;
    }
}