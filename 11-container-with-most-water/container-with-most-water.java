class Solution 
{
    public int maxArea(int[] height) 
    {
        int len = height.length , left = 0 , right = len-1 , currArea = 0 , maxArea = Integer.MIN_VALUE;

        while(left < right)
        {
            currArea = Math.min(height[left],height[right]) * (right-left);
            maxArea = Math.max(currArea , maxArea);
            if(height[left] < height[right])
                left++;
            else 
                right--;
        }

        return maxArea;
    }
}