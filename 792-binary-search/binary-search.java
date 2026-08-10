class Solution 
{
    static int binarySearch(int []arr , int left , int right , int target)
    {
        while(left <= right)
        {
            int mid = left+(right-left)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                right = mid-1;
            else
                left = mid+1;
    
        }
        return -1;
    }   
    public int search(int[] nums, int target) 
    {
        return binarySearch(nums , 0 , nums.length-1 , target);
    }
}