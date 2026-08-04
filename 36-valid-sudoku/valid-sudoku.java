class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        boolean []row = new boolean[10];
        boolean []col = new boolean[10];

        for(int i = 0 ; i < 9 ; i++)
        {
            for(int j = 0 ; j < 9 ; j++)
            {
                if((board[i][j] != '.') && (row[board[i][j]-'0']))
                    return false;
                if((board[j][i] != '.') && (col[board[j][i]-'0']))
                    return false;
                if(board[i][j] != '.')
                    row[board[i][j]-'0'] = true;
                if(board[j][i] != '.') 
                    col[board[j][i]-'0'] = true;
            }
            Arrays.fill(row , false);
            Arrays.fill(col , false);
        }
        for(int i = 0 ; i < 9 ; i+=3)
        {
            for(int j = 0 ; j < 9 ; j+=3)
            {
                for(int r = i ; r < i+3 ; r++)
                {
                    for(int c = j ; c < j+3 ; c++)
                    {
                        if(board[r][c] != '.' && row[board[r][c]-'0'])
                            return false;
                        if(board[r][c] != '.')
                            row[board[r][c]-'0'] = true;
                    }
                }
                Arrays.fill(row , false);
            }
        }
        return true;
    }
}