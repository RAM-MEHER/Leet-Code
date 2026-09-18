class Solution 
{
    public boolean carPooling(int[][] trips, int capacity) 
    {
        Arrays.sort(trips, (a, b) -> 
        {
            if (a[1] != b[1]) 
                return Integer.compare(a[1], b[1]);
            return Integer.compare(a[2], b[2]);
        }); 

        int len = trips.length , cap = 0;

        for(int i = 0 ; i < len ; ++i)
        {
            cap = 0;
            for(int j = i ; j >= 0 ; --j)
            {
                if(trips[i][1] < trips[j][2])
                    cap += trips[j][0];
                if(cap > capacity)
                    return false;
            }
        }
        return true;
    }
}