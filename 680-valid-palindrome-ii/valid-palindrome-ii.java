class Solution 
{
    static boolean edgeMethod(String s , int left , int right)
    {
        while(left <= right)
        {
            if(!isEqual(s.charAt(left++),s.charAt(right--)))
                return false;
        }
        return true;
    }
    static boolean isEqual(char a , char b)
    {
        return a==b;
    }
    public boolean validPalindrome(String s) 
    {
        int len = s.length() , left = 0 , right = len-1 , checkLeft = -1 , checkRight = -1;
        boolean used = false , ans = false;
        while(left <= right)
        {
            if(isEqual(s.charAt(left) , s.charAt(right)))
            {
                left++; right--;
                continue;
            }
            else if(!isEqual(s.charAt(left) , s.charAt(right)) && !used)
            {
                used = true;
                if((isEqual(s.charAt(left) , s.charAt(right-1))) && isEqual(s.charAt(left+1) , s.charAt(right)))
                {
                    checkLeft = left; checkRight = right;
                    break;
                }
                else if(isEqual(s.charAt(left) , s.charAt(right-1)))
                {
                    right--; continue;
                }
                else if(isEqual(s.charAt(left+1) , s.charAt(right)))
                {
                    left++; continue;
                }

            }
            else return false;
        }
        ans = edgeMethod(s , checkLeft+1 , checkRight) || edgeMethod(s , checkLeft , checkRight-1);
        return ans;
    }
}