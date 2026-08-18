class Solution 
{
    public int largestInteger(int[] nums, int k) 
    {
        int ans = -1 , len = nums.length , max = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        {
            max = Math.max(i , max);
            map.put(i , map.getOrDefault(i,0)+1);
        }
        if(k == 1)
        {
            for(Map.Entry<Integer,Integer> entry : map.entrySet())
            {
                if(entry.getValue() == 1)
                    ans = Math.max(ans , entry.getKey());
            }
        }
        else if(k == len)
        {
            ans = max;
        }
        else
        {
            if(map.get(nums[0]) == 1)
                ans = Math.max(ans , nums[0]);
            if(map.get(nums[len-1]) == 1)
                ans = Math.max(ans , nums[len-1]);
        }
        return ans;
    }
}