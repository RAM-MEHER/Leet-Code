class Solution 
{
    public List<Integer> findMissingElements(int[] nums) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int []freq = new int[101];

        for(int i = 0 ; i < nums.length ; i++)
        {
            freq[nums[i]]++;
        }
        boolean flag = false;
        for(int i = 1 ; i <= 100 ; i++)
        {
            if(!flag && (freq[i] != 0))
                flag = true;
            if(flag && (freq[i] == 0))
                temp.add(i);
            else if(freq[i] != 0)
            {
                ans.addAll(temp);
                temp.clear();
            }
        }
        return ans;
    }
}