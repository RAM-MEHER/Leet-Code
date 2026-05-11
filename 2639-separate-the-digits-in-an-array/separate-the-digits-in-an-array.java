class Solution {
    static ArrayList<Integer> ans = new ArrayList<>();
    public static void addnum(int num)
    {
        if(num == 0)
            return ;
        addnum(num/10);
        ans.add(num%10);
    }
    public int[] separateDigits(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] > 9)
                addnum(nums[i]);
            else
                ans.add(nums[i]);
        }

        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        ans.clear();
        return arr;
    }
}