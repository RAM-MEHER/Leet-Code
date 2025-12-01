class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        if(s.length() == 0)
            return 0;
        else if(s.length() == 1)
            return 1;

        StringBuilder unique = new StringBuilder(String.valueOf(s.charAt(0)));
        int i , maxlen = Integer.MIN_VALUE , c = 0;
         for(i = 1 ; i < s.length() ; i++)
         {
            while(unique.indexOf(String.valueOf(s.charAt(i))) != -1)
            {
                if(c == 0)
                    maxlen = (maxlen > unique.length())? maxlen : unique.length();
                unique.deleteCharAt(0);
                c = 1;
            }
            c = 0;
            unique.append(s.charAt(i));
         }
         maxlen = (maxlen > unique.length())? maxlen : unique.length();
         return maxlen;
    }
}