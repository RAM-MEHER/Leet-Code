class Solution 
{
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int len = arr.length , left = 0 , right = len-1;

        for(int i = 0 ; i < len ; i++)
            arr[i] = x-arr[i];
        
        while((right-left) > k-1)
        {
            if(Math.abs(arr[left]) > Math.abs(arr[right]))
                left++;
            else
                right--;
        }

        for(int i = left ; i <= right ; i++)
            ans.add(x-arr[i]);
        
        return ans;
    }
}