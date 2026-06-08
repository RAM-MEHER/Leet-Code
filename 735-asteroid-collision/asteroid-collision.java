class Solution 
{
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < asteroids.length ; i++)
        {
            if(st.isEmpty())
                st.push(asteroids[i]);
            else
            {
                if(st.peek() * asteroids[i] > 0)
                    st.push(asteroids[i]);
                else
                {
                    if((st.peek() > 0) && (asteroids[i] < 0))
                    {
                        while(true)
                        {
                            if(st.isEmpty())
                            {
                                st.push(asteroids[i]);
                                break;
                            }
                            else if(st.peek() > 0) 
                            {
                                if(st.peek() < Math.abs(asteroids[i]))
                                    st.pop();
                                else if(st.peek() > Math.abs(asteroids[i]))
                                    break;
                                else
                                {
                                    st.pop();
                                    break;
                                }
                            } 
                            else
                            {
                                st.push(asteroids[i]);
                                break;
                            }
                        }
                    }
                    else
                        st.push(asteroids[i]);
                }
            }
        }
        int []ans = new int[st.size()];
        int p = 0;
        for(int i : st)
        {
            ans[p++] = i;
        }
        st.clear();

        return ans; 
    }
}