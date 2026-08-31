class Node 
{
    int key;
    int value;
    Node next;
    Node(int key , int val , Node after)
    {
        this.key = key;
        value = val;
        next = after;
    }
}
class MyHashMap 
{
    int bucket;
    Node []buckets;
    public MyHashMap() 
    {
        buckets = new Node[1001];
    }
    
    public void put(int key, int value) 
    {
        Node temp = buckets[key%1001];
        if(temp == null)    
        {
            buckets[key%1001] = new Node(-2 , -2 , null);
            temp = buckets[key%1001];
        }
        while(temp.next != null)
        {
            if(temp.key == key)
            {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        if(temp.key == key)
            temp.value = value;
        else
            temp.next = new Node(key , value , null);
    }
    
    public int get(int key) 
    {
        bucket = key % 1001;
        Node temp = buckets[bucket];
        if(temp == null)
        {
           return -1;
        }
        while(temp.next != null)
        {
            if(temp.key == key)
                return temp.value;
            temp = temp.next;   
        }
        if(temp.key == key)
            return temp.value;
        return -1;
    }
    
    public void remove(int key) 
    {
        int bucket = key%1001;
        Node temp = buckets[bucket];

        if(temp == null)
            return;
        while(temp.next != null)
        {
            if(temp.next.key == key)
            {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */