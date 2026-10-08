class Solution 
{
    public String removeOuterParentheses(String s) 
    {
        int len = s.length() , open = 0;
        boolean part = false;
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < len ; i++)
        {
            if(s.charAt(i) == '(')
            {
                if(part)
                {
                    open++;
                    ans.append('(');
                }
                else
                {
                    part = true;
                }
            }
            else
            {
                if(open == 0)
                {
                    part = false;

                }
                else
                {
                    open--;
                    ans.append(')');
                }
            }
        }  
        return ans.toString();  
    }
}