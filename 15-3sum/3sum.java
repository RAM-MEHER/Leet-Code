class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        int len = nums.length , forTriplet = Integer.MIN_VALUE , leftTripilet = Integer.MIN_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0 ; i < len ; i++)
        {
            if(nums[i] == forTriplet)
                continue;
            int left = i+1 , right = len-1; 
            leftTripilet = Integer.MIN_VALUE;
            while(left < right)
            {
                int val = nums[i]+nums[left]+nums[right];
                if(val == 0)
                {
                    forTriplet = nums[i];
                    if(leftTripilet == nums[left])
                    {
                        left++; continue;
                    }
                    else
                    {
                        leftTripilet = nums[left];
                        ans.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    }
                }
                else if(val > 0)
                    right--;
                else
                    left++;
            }
        }
        return ans;
    }
}