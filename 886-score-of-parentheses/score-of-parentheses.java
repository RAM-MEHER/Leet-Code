
class Solution 
{
    public int scoreOfParentheses(String s) 
    {
        int len = s.length();
        Deque<Integer> st = new ArrayDeque<>();
        st.offerLast(0);

        for(int i = 0 ; i < len ; i++)
        {
            if(s.charAt(i) == '(')
            {
                st.offerLast(0);
            }
            else
            {
                int currIn = st.pollLast();
                int contrBrace = st.pollLast();
                if(currIn == 0)
                {
                    st.offerLast(contrBrace+1);
                }
                else
                {
                    st.offerLast(contrBrace + 2* currIn);
                }
            }
        }
        return st.pollFirst();
    }
}