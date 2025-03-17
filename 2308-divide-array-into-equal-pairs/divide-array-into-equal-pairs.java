class Solution 
{
    public boolean divideArray(int[] nums) 
    {
        int size = nums.length ;
        HashMap<Integer , Integer> freq = new HashMap<>();

        for(int num : nums)
        {
            int count = freq.getOrDefault(num , 0);
            freq.put(num , count+1);
        }    

        for(Integer num : freq.keySet())
        {
            Integer val = freq.get(num);
            if(val % 2 != 0)
                return false;
        }

        return true;
    }
}