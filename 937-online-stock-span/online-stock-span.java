class StockSpanner 
{
    int [][]st;
    int top ;
    public StockSpanner() 
    {
        st = new int[10000][2];
        top = -1;
    }
    
    public int next(int price) 
    {
        int span = 1;
        while(top >= 0 && st[top][0] <= price)
        {
            span += st[top--][1];
        }
            st[++top][0] = price;
            st[top][1] = span;
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */