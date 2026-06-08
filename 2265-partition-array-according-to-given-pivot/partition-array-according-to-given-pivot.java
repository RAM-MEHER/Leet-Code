class Solution 
{
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int size = nums.length , i , p = 0;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();   

        for(i = 0 ; i < size ; i++)
        {
            if(nums[i] < pivot)
                left.add(nums[i]);
            else if(nums[i] == pivot)
                p++;
            else
                right.add(nums[i]);
        } 
        while(p-- != 0)
            left.add(pivot);

        left.addAll(right);

        int []ans = new int[left.size()];

        for(i = 0 ; i < left.size() ; i++)
            ans[i] = left.get(i);

        return ans;
    }
}