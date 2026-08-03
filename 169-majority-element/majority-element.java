class Solution 
{
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0 , max = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) >= nums.length/2)
            {
                if(map.get(nums[i]) > max)
                {
                    ans = nums[i];
                    max = map.get(nums[i]);
                }
            }
        }
        return ans;
    }
}