class MyCircularQueue 
{
    int []queue ;
    int front = 0 , rear = 0 , len = 0;
    public MyCircularQueue(int k) 
    {
        queue = new int[k];
        len = k;
    }
    
    public boolean enQueue(int value) 
    {
        if(!isFull())
        {
            queue[(rear++)%len] = value;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() 
    {
        if(!isEmpty())
        {
            front++;
            return true;
        }
        return false;
    }
    
    public int Front() 
    {
        if(!isEmpty())
            return queue[front%len];
        return -1;
    }
    
    public int Rear() 
    {
        if(!isEmpty())
            return queue[(rear-1)%len];
        return -1;
    }
    
    public boolean isEmpty() 
    {
        return (front == rear);
    }
    
    public boolean isFull() 
    {
        return (rear-front) == len;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */