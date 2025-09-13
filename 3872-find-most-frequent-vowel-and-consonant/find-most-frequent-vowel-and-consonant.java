class Solution 
{
    public int maxFreqSum(String s) 
    {
        int []freq = new int[27];
        int vmax = 0 , cmax = 0 , i;

        for(i = 0 ; i < s.length() ; i++)
            freq[s.charAt(i)-'a']++;
        
        for(i = 0 ; i < 27 ; i++)
        {
            if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20)
                vmax = (vmax > freq[i])? vmax : freq[i];
            else
                cmax = (cmax > freq[i])? cmax : freq[i];
        }

        return vmax+cmax;
    }
}