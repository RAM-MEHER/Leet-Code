class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums)
        {
            if(!set.add(i))
                return i;
        }
        return 0; // should not be solved like this there is optimal solution for this floyd's cycle detection.
    }
}