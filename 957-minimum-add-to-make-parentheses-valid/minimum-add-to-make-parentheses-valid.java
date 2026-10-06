class Solution 
{
    public int minAddToMakeValid(String s) 
    {
        int open = 0 , len = s.length() , ans = 0;

        for(int i = 0 ; i < len ; i++)
        {
            if(s.charAt(i) == '(')
                open++;
            else
            {
                if(open > 0)
                    open--;
                else
                    ans++;
            }
        }
        ans += open;
        return ans;
    }
}