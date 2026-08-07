class Solution 
{
    public int numRescueBoats(int[] people, int limit) 
    {
        int len = people.length , left = 0 , right = len-1 , boats = 0;

        Arrays.sort(people);
        while(left <= right)
        {
            if(people[left]+people[right] <= limit)
            {
                boats++;    left++;     right--;
            }
            else
            {
                right--;    boats++;
            }
        }

        return boats;
    }
}