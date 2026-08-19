class Solution 
{
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) 
    {
        int ans = 0 , i = 0 , len = reservedSeats.length , next = 1 , max = 0;
        boolean []row = new boolean[11];
        Arrays.fill(row , true);
        Arrays.sort(reservedSeats , (a,b)->{
            if(a[0] != b[0])
                return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
        });

       for(i = 0 ; i < len-1 ; i++)
       {
            if(reservedSeats[i][0] == next)
            {
                next += 1;
            }
            else if(reservedSeats[i][0] > next)
            {
                ans += (reservedSeats[i][0]-next)*2;
                next = reservedSeats[i][0]+1;
            }
            if(reservedSeats[i][0] == reservedSeats[i+1][0])
            {
                row[reservedSeats[i][1]] = false;
            }
            else
            {
                row[reservedSeats[i][1]] = false;
                if((row[2]&&row[3])&&(row[4]&&row[5]))
                {
                    ans++;
                    for(int k = 2 ; k <= 5 ; k++)
                        row[k] = false;
                }
                if((row[4]&&row[5])&&(row[6]&&row[7]))
                {
                    ans++;
                    for(int k = 4 ; k <= 7 ; k++)
                        row[k] = false;
                }
                if((row[6]&&row[7])&&(row[8]&&row[9]))
                    ans++;
                Arrays.fill(row,true);
            }
       }

       row[reservedSeats[len-1][1]] = false;
       if((row[2]&&row[3])&&(row[4]&&row[5]))
       {
           ans++;
           for(int k = 2 ; k <= 5 ; k++)
               row[k] = false;
       }
       if((row[4]&&row[5])&&(row[6]&&row[7]))
       {
           ans++;
           for(int k = 4 ; k <= 7 ; k++)
               row[k] = false;
       }
       if((row[6]&&row[7])&&(row[8]&&row[9]))
           ans++;

        max = reservedSeats[len-1][0];
        if(next < max)
        {
            ans += (max - next)*2;
        }
        if(max < n)
        {
            ans += (n-max)*2;
        }
       return ans;
    }
}