class Solution 
{
    public long maxAlternatingSum(int[] nums) 
    {
        long ans = 0 , len = nums.length;

        for(int i = 0 ; i < len ; i++)
            nums[i] = Math.abs(nums[i]);
            
        Arrays.sort(nums);

        for(int i = 0 ; i < len ; i++)
        {
            if(i < Math.ceil(len/2))
                ans -= Math.pow(nums[i] , 2);
            else
                ans += Math.pow(nums[i] , 2);
        }    
        return ans;
    }
}