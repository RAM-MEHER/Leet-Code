class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        int len1 = s1.length() , len2 = s2.length() , left = 0 , right = len1-1;
        int freqS2[] = new int[26];
        int freqS1[] = new int[26];
        boolean found = true;

        if(len1 > len2)
            return false;
        
        for(int i = 0 ; i < len1 ; i++)
            freqS1[s1.charAt(i)-'a']++;
        
        for(int i = left ; i <= right ; i++)
            freqS2[s2.charAt(i)-'a']++;

        while(right < len2)
        {
            found = true;
            for(int i = 0 ; i < 26 ; i++)
            {
                if(freqS1[i] != freqS2[i])
                {
                    found = false;  break;
                }
            }
            if(found)
                return true;
            if(right == len2-1)
                break;
            freqS2[s2.charAt(left++)-'a']--;
            freqS2[s2.charAt(++right)-'a']++;
        }
        return false;
    }
}