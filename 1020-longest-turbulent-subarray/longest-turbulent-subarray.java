class Solution 
{
    public int maxTurbulenceSize(int[] arr) 
    {
        int ans = Integer.MIN_VALUE , curr = 2 , same = 0;

        for(int i = 1 ; i < arr.length-1 ; i++)
        {
            if((arr[i-1] < arr[i]) && (arr[i] > arr[i+1]))
                curr++;
            else if((arr[i-1] > arr[i]) && (arr[i] < arr[i+1]))
                curr++;
            else
                curr = 2;
            if((arr[i-1] == arr[i]) && (arr[i] == arr[i+1]))
                same++;
            ans = Math.max(ans , curr);
        }
        if(arr.length == 2)
        {
            if(arr[0] == arr[1])
                return 1;
            return 2;
        }
        if(arr.length == 1)
            return 1;
        if(same == arr.length-2)
            return 1;
        return ans;    
    }
}