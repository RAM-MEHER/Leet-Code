class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap<Character , Integer> map = new HashMap<>();
        int len = s.length() , ans = 0 , st = 0;
        
        if(len == 0)
            return 0;
        for(int i = 0 ; i < len ; i++)
        {
            int ind = map.getOrDefault(s.charAt(i),-1);
            if(ind == -1)
                map.put(s.charAt(i),i);
            else if(ind >= st)
                st = ind+1;
            map.put(s.charAt(i),i);
            ans = Math.max(ans , i-st);
        }
        return ans+1;
    }
}