class Solution 
{
    public int minimumRecolors(String blocks, int k) 
    {
        int size = blocks.length() , left = 0 , right = k-1 , whites = 0 , min_whites = Integer.MAX_VALUE , i;

        for(i = left ; i <= right ; i++)
            if(blocks.charAt(i) == 'W') whites++;
        min_whites = (whites < min_whites)? whites : min_whites;

        //System.out.println(whites);
        while(right < size)
        {
            right++;
            left++;
            if(right == size) break;

            min_whites = (whites < min_whites)? whites : min_whites;

             if(blocks.charAt(left-1) == 'W') whites--;
             if(blocks.charAt(right) == 'W') whites++;

            //System.out.println("Mins : "+min_whites);
            //System.out.println("whites : "+whites);
            if(min_whites == 0) return 0;
        }
        min_whites = (whites < min_whites)? whites : min_whites;

        return min_whites;
    }
}