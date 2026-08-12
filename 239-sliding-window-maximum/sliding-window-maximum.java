class Solution 
{
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int len = nums.length;
        int []ans = new int[len-k+1];
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0 ; i < k ; i++)
        {
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
            {
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        ans[0] = nums[dq.peekFirst()];
        for(int i = k ; i < len ; i++)
        {
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
                dq.pollLast();
            while(!dq.isEmpty() && dq.peekFirst() < i-k+1)
                dq.pollFirst();
            dq.offerLast(i);
            ans[i-k+1] = nums[dq.peekFirst()];
        }
        return ans;
    }
}