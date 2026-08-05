class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        int len1 = word1.length() , len2 = word2.length();
        StringBuilder ans = new StringBuilder(len1+len2);

        int i = 0;
        while(true)
        {
            if((i >= len1) || (i >= len2))
                break;
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i++));
        }
        while(i < len1)
            ans.append(word1.charAt(i++));
        while(i < len2)
            ans.append(word2.charAt(i++));

        return ans.toString();
    }
}