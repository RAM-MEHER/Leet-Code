class Solution 
{
    static void reverse(int []arr , int left , int right)
    {
        while(left <= right)
        {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
    public void rotate(int[] nums, int k) 
    {
        int len = nums.length , c = 1 , store = nums[len-1] , i = len-1 , pick = nums[0];
        k %= len;

        reverse(nums , 0 , len-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k , len-1);
    }
}