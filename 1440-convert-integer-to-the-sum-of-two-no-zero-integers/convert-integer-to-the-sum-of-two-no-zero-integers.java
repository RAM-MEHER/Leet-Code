class Solution 
{
    public int[] getNoZeroIntegers(int n) 
    {
       int i , a = 0;
       for(i = 1 ; i < n ; i++)
       {
        a = n-i;
        if(String.valueOf(a).contains("0") || String.valueOf(i).contains("0"))
            continue;
        else break;
       }
       return new int[]{a,i};
    }
}