class Solution 
{
    public int firstMissingPositive(int[] nums) 
    {
        int len = nums.length , minRequried = 1;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < len ; i++)
        {
            while(nums[i] == minRequried || set.contains(minRequried))
                minRequried++;
            if(nums[i] > minRequried && nums[i] <= len)
                set.add(nums[i]);
        }
        return minRequried;
    }
}