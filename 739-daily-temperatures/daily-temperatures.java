class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int len = temperatures.length ;
        int []st = new int[len];
        int []ans = new int[len];
        int top = -1;
        for(int i = 0 ; i < len ; i++)
        {
            while(top != -1 && temperatures[st[top]] < temperatures[i])
            {
                ans[st[top]] = i-st[top];
                top--;
            }
            st[++top] = i;
        }
        return ans;
    }
}