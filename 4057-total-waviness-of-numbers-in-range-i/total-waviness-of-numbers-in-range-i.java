class Solution {
    public int totalWaviness(int num1, int num2) {
        int waviness = 0;

        for(int i = num1 ; i <= num2 ; i++)
        {
            StringBuilder str = new StringBuilder(String.valueOf(i));
            for(int j = 1 ; j < str.length()-1 ; j++)
            {
                if((str.charAt(j) > str.charAt(j+1)) && (str.charAt(j) > str.charAt(j-1)))
                    waviness++;
                else if((str.charAt(j) < str.charAt(j+1)) && (str.charAt(j) < str.charAt(j-1)))
                    waviness++;
            }
        }
        return waviness;
    }
}