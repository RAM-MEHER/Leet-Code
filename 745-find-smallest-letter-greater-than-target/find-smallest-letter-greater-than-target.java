class Solution 
{
    public char nextGreatestLetter(char[] letters, char target) 
    {
        char min = Character.MAX_VALUE;
        char ans = ' ';

        for(int i = 0 ; i < letters.length ; i++)
        {
            if(letters[i] > target)
                if(letters[i] < min)
                    min = letters[i];
        }
        return (min != Character.MAX_VALUE)? min : letters[0];
    }
}