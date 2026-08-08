class Solution 
{
    static int whichClosed(char c)
    {
        if(c == ')')
            return 1;
        else if(c == ']')
            return 2;
        return 3;
    }
    static boolean isOpen(char c)
    {
        return ((c == '(') || (c == '{') || (c == '['));
    }
    public boolean isValid(String s) 
    {
        int len = s.length() , top = -1;
        char stack[] = new char[len];

        for(int i = 0 ; i < len ; i++)
        {
            if(isOpen(s.charAt(i)))
            {
                stack[++top] = s.charAt(i);
            }
            else
            {
                if(top < 0)
                    return false;
                int val = whichClosed(s.charAt(i));

                if(val == 1)
                {
                    if(stack[top] == '(')
                        --top;
                    else return false;
                }
                else if(val == 2)
                {
                    if(stack[top] == '[')
                        --top;
                    else return false;
                }
                else
                {
                    if(stack[top] == '{')
                        --top;
                    else return false;
                }
            }
        }
        if(top >= 0)
            return false;
        return true;
    }
}