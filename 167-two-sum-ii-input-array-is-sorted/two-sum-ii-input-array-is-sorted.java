class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int []ans = new int[2];

        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < numbers.length ; i++)
        {
            map.put(numbers[i] , map.getOrDefault(numbers[i],0)+1) ;
        }
        
        for(int i = 0 ; i < numbers.length-1 ; i++)
        {
            if(map.get(target-numbers[i]) != null)
            {
                if(numbers[i] == (target-numbers[i]))
                {
                    if(map.get(numbers[i]) > 1)
                    {
                        ans[0] = i+1;
                        ans[1] = i+2;
                        break;
                    }
                }
                else
                {
                    ans[0] = i+1;
                    ans[1] = Arrays.binarySearch(numbers , (target-numbers[i]))+1;
                    break;
                }
            }
        }
       
        return ans;
    }
}