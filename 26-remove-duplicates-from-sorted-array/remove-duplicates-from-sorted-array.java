class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int l = 0 , len = nums.length;
        boolean c = true;
        for(int i = 0 ; i < len-1 ; i++)
        {
            if(nums[i] != nums[i+1])
            {
                nums[l++] = nums[i];
                c = false;
            }
            else c = true;
        }
        if(c)
        {
            nums[l++] = nums[len-1];
        }
        try
        {
            if(nums[len-1] != nums[len-2])
                nums[l++] = nums[len-1];
        } catch (Exception e){}
        return l;
    }
}