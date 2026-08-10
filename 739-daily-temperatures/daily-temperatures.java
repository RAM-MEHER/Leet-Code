class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int len = temperatures.length ;
        int [][]st = new int[len][2];
        int []ans = new int[len];
        int top = -1;
        for(int i = 0 ; i < len ; i++)
        {
            while(top != -1 && st[top][0] < temperatures[i])
            {
                ans[st[top][1]] = i-st[top][1];
                top--;
            }
            st[++top][0] = temperatures[i];
            st[top][1] = i;
        }
        return ans;
    }
}