class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int len = numbers.length , left = 0 , right = len-1; 

        while(left < right)
        {
            int sum = numbers[left]+numbers[right];
            if(sum == target)
                return new int[]{++left , ++right};
            else if(sum < target)
            {
                sum -= numbers[left++];
                sum += numbers[left];
            }
            else
            {
                sum -= numbers[right--];
                sum += numbers[right];
            }
        }
        return new int[]{0,0};
    }
}