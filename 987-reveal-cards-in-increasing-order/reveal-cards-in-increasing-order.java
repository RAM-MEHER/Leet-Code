class Solution 
{
    public int[] deckRevealedIncreasing(int[] deck) 
    {
        Arrays.sort(deck);
        Queue<Integer> queue = new ArrayDeque<>(deck.length);

        for(int i = 0 ; i < deck.length ; i++)
            queue.offer(i);
        
        int ind = 0;
        int ans[] = new int[deck.length];
        while(!queue.isEmpty())
        {
            ans[queue.poll()] = deck[ind++];

            if(!queue.isEmpty())
                queue.offer(queue.poll());
        }

        return ans;    
    }
}