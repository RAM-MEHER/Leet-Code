class Pair
{
    int key , value;
    Pair(int ke , int valu)
    {
        key = ke;
        value = valu;
    }
}
class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        int []ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.value,b.value));

        for(int i = 0 ; i < nums.length ; i++)
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(pq.size() < k)
                pq.offer(new Pair(entry.getKey() , entry.getValue()));
            else
            {
                if(entry.getValue() > pq.peek().value)
                {
                    pq.poll(); pq.offer(new Pair(entry.getKey() , entry.getValue()));
                }
            }
        }
        int i = 0;
        while(!pq.isEmpty())
        {
            ans[i++] = pq.poll().key;
        }
        return ans;
    }
}