class Solution 
{
    public boolean asteroidsDestroyed(int mass, int[] asteroids) 
    {
          Arrays.sort(asteroids);
          long m = mass;
          for(int i = 0 ; i < asteroids.length ; i++)
          {
              if(m >= asteroids[i])
                m += asteroids[i];
              else
                return false;
          }
          
          return true;
    }
}


/* this is optimal and tiem complexity is O(n logn) for sorting and O(n) for traversing and O(1) for space complexity */