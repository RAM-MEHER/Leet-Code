class Solution 
{
    public boolean carPooling(int[][] trips, int capacity) 
    {
        int noOfTrips = trips.length , countOfPass = 0;
        int passengers[] = new int[1001];

        for(int i = 0 ; i < noOfTrips ; ++i)
        {
            passengers[trips[i][1]] += trips[i][0];
            passengers[trips[i][2]] -= trips[i][0];
        }
        for(int noOfPass : passengers)
        {
            countOfPass += noOfPass;
            if(countOfPass > capacity)
                return false;
        }
        return true;
    }
}