// import org.apache.commons.math3.primes.Primes;
class Solution 
{
    public int[] closestPrimes(int left, int right) 
    {
        int []ans = new int[]{-1,-1};
        int i , first = 0 , second = 0, count = 0 , diff , min_diff = Integer.MAX_VALUE;
        
        // Seive Algorithm : 
        boolean []primes = new boolean[right+1];
        Arrays.fill(primes , true);

        primes[0] = primes[1] = false;

        for(i = 2 ; i <= Math.sqrt(right) ; i++)
        {
            if(primes[i])
            {
                for(int j = i*i ; j <= right ; j+=i)
                    primes[j] = false;
            }
        }
        // Sieve ends and we have the prime numbers in primes upto the right value.
        for(i = left ; i <= right ; i++)
        {
            if(primes[i] && i > 1)
            {
                count++;
                if(count % 2 == 1 && count == 1)
                    first = i;
                else if(count % 2 == 0 && count == 2)
                    second = i;
                else
                {
                    first = second;
                    second = i;
                }
// Upto Counting the Primes. -----------------------------------------------------
                if(count >= 2)
                {
                    diff = second - first;

                    if(diff < min_diff)
                    {
                        ans[0] = first;
                        ans[1] = second;
                        min_diff = diff;
                    }
                }
            }

        }

        return ans;
    }
}