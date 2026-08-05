class Solution 
{
    static boolean check(char c)
    {
        return ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }
    public boolean isPalindrome(String s) 
    {
        String S = s.toLowerCase();
        int len = S.length() , left = 0 , right = len-1;
        while(left <= right)
        {
            if(!check(S.charAt(left)))
            {
                left++; continue;
            }
            else if(!check(S.charAt(right)))
            {
                right--; continue;
            }
            else
            {
                if(S.charAt(left++) != S.charAt(right--))
                    return false;
                //System.out.println(left + " " + right);
            }
        }
        return true;
    }
}