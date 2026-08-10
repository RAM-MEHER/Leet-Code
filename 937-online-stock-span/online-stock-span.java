class StockSpanner 
{
    int []st ;
    int top ;
    public StockSpanner() 
    {
        st = new int[10000];
        top = -1;
    }
    
    public int next(int price) 
    {
        int ans = 1 , i = top;
         while(i >= 0 && st[i] <= price)
         {
            ans++;  i--;
         }
         st[++top] = price;
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */