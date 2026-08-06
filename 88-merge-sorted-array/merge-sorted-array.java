class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int len = nums1.length-1 , n1 = m-1 , n2 = n-1;

        while((n2 >= 0) && (n1 >= 0))
        {
            if(nums1[n1] > nums2[n2])
            {
                nums1[len--] = nums1[n1--];
            }
            else if(nums1[n1] < nums2[n2])
            {
                nums1[len--] = nums2[n2--];
            }
            else
            {
                nums1[len--] = nums2[n2--];
            }
        }
        while(n2 >= 0)
            nums1[len--] = nums2[n2--];
        while(n1 >= 0)
            nums1[len--] = nums1[n1--];
    }
}