class Solution 
{
    public boolean checkValidString(String s) 
    {
        int len = s.length();

        Deque<Integer> open = new ArrayDeque<>();
        Deque<Integer> star = new ArrayDeque<>();

        for(int i = 0 ; i < len ; i++)
        {
            if(s.charAt(i) == '(')
                open.offerLast(i);
            else if(s.charAt(i) == '*')
                star.offerLast(i);
            else
            {
                if(!open.isEmpty())
                    open.pollLast();
                else if(!star.isEmpty())
                    star.pollFirst();
                else
                    return false;
            }
        }
        while(!open.isEmpty() && !star.isEmpty())
        {
            if(open.peekLast() < star.peekLast())
            {
                open.pollLast();    
                star.pollLast();
            }
            else
                return false;
        }
        if(!open.isEmpty())
            return false;
        return true;
    }
}