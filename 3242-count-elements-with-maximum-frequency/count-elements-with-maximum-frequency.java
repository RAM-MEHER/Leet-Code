class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
        int max = Integer.MIN_VALUE , sum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
            max = (map.get(nums[i]) > max)? map.get(nums[i]) : max;
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(map.get(nums[i]) == max)
            {
                sum += max;
                map.put(nums[i] , 0);
            }
        }
        return sum;
    }
}