class Solution 
{
    public int calPoints(String[] operations) 
    {
        int ans = 0 , len = operations.length , p = -1;
        int []arr = new int[len];

        for(int i = 0 ; i < len ; i++)
        {
            if(operations[i].equals("C"))
            {
                ans -= arr[p--];
            }
            else if(operations[i].equals("D"))
            {
                arr[++p] = 2*arr[p-1];
                ans += arr[p];
            }
            else if(operations[i].equals("+"))
            {
                arr[++p] = arr[p-1]+arr[p-2];
                ans += arr[p];
            }
            else
            {
                int val = Integer.parseInt(operations[i]);
                ans += val;
                arr[++p] = val;
            }
        }
        return ans;
    }
}