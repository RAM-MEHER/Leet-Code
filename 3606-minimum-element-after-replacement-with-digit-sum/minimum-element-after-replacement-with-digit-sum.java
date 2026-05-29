class Solution {
    
    public static int method(int num , int min)
    {
        int val = num;
        if(num <= 9)
            val = num;
        else
        {
            int sum = 0;
            while(num != 0)
            {
                sum += num % 10;
                num /= 10;
            }
            val = sum;
            System.out.println(val);
        }
        if(min > val)
            min = val;
            
        return min;
    }
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++)
           min =  method(nums[i] , min);
            
        return min;
    }
}