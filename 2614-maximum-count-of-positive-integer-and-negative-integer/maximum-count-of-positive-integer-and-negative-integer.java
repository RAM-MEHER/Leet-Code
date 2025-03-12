class Solution 
{
    public int maximumCount(int[] nums) 
    {
        int size = nums.length , pos = 0 , negs = 0;

        for(int i : nums)
        {
            if(i < 0) negs++;
            else
            {
                if(i > 0) pos++;
            }
        }  
        return (pos > negs)? pos : negs;  
    }
}