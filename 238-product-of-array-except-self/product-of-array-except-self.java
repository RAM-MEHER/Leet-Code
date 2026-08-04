class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int len = nums.length , j = len-1;
        int []prefix = new int[len];
        int []suffix = new int[len];

        for(int i = 0 ; i < len ; i++)
        {
            if(i == 0)
                prefix[i] = nums[i];
            else
                prefix[i] = prefix[i-1]*nums[i];
            if(j == len-1)
                suffix[j] = nums[j];
            else
                suffix[j] = suffix[j+1]*nums[j];
            --j;
        }

        nums[0] = suffix[1];
        nums[len-1] = prefix[len-2];
        for(int i = 1 ; i < len-1 ; i++)
        {
            nums[i] = prefix[i-1]*suffix[i+1];
        }
        return nums;
    }
}