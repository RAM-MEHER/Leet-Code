class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        if(k == 0) return false;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(map.containsKey(nums[i]))
            {
                if((i-map.get(nums[i])) <= k)
                    return true;
                else if((i-map.get(nums[i])) > k)
                    map.put(nums[i] , i);
            }
            else
                map.put(nums[i] , i);
        }
        return false;
    }
}

/*
Time Complexity : O(n)
Space Complexity : O(n)
can be optimize using hashset instead of hashmap
*/