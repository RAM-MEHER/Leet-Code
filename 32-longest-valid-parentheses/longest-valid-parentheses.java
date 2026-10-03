class Solution 
{
    public int longestValidParentheses(String s) 
    {
        int len = s.length() , ans = 0 , max_ans = 0 , pointer = 0;
        int []mate = new int[len];
        Deque<Integer> st = new ArrayDeque<>();

        for(int i = 0 ; i < len ; i++)
        {
            if(s.charAt(i) == '(')
            {
                st.offerLast(i);
            }
            else
            {
                if(!st.isEmpty())
                {
                    mate[st.peekLast()] = i;
                    st.pollLast();
                }
            }
        }

        while(pointer < len)
        {
            if(mate[pointer] > 0)
            {
                ans += mate[pointer]-pointer+1;
                pointer = mate[pointer]+1;
            }
            else
            {
                ans = 0;
                pointer++;
            }
            max_ans = Math.max(ans , max_ans);
        }
        return max_ans;
    }
}