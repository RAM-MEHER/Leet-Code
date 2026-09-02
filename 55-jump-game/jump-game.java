class Solution 
{
    public boolean canJump(int[] nums) 
    {
        int len = nums.length , target = len-1;
        
        if(len == 1)
            return true;
        for(int i = len-2 ; i > 0 ; i--)
        {
            if(nums[i] >= (target-i))
                target = i;
        }
        if(nums[0] < (target))
            return false;
        return true;
    }
}