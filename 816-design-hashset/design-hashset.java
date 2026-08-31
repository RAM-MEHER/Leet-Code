class Node 
{
    int value;
    Node next;
    Node(int val , Node after)
    {
        value = val;
        next = after;
    }
}

class MyHashSet 
{
    int bucket;
    Node []buckets;
    public MyHashSet() 
    {
        buckets = new Node[1001];
    }
    
    public void add(int key) 
    {
        if(contains(key))
            return;
        Node temp = buckets[key%1001];
        if(temp == null)    
        {
            buckets[key%1001] = new Node(-2 , null);
            temp = buckets[key%1001];
        }
        while(temp.next != null)
            temp = temp.next;
        temp.next = new Node(key , null);
    }
    
    public void remove(int key) 
    {
        int bucket = key%1001;
        Node temp = buckets[bucket];

        if(temp == null)
            return;
        while(temp.next != null)
        {
            if(temp.next.value == key)
            {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }   
    
    public boolean contains(int key) 
    {
        bucket = key % 1001;
        Node temp = buckets[bucket];
        if(temp == null)
        {
           return false;
        }
        while(temp.next != null)
        {
            if(temp.value == key)
                return true;
            temp = temp.next;   
        }
        if(temp.value == key)
            return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */