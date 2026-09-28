class Solution 
{
    public int maxDepth(String s) 
    {
        int ans = Integer.MIN_VALUE , open = 0;

        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == '(')
                open++;
            else if(s.charAt(i) == ')')
                open--;
            ans = Math.max(open , ans);
        }    
        return ans;
    }
}