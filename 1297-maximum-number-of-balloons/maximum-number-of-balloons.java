class Solution 
{
    public int maxNumberOfBalloons(String text) 
    {
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < text.length() ; i++)
        {
            if("balon".contains(String.valueOf(text.charAt(i))))
                map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        int min = Integer.MAX_VALUE;
        min = Math.min(map.getOrDefault('b',0) , min);
        min = Math.min(map.getOrDefault('a',0) , min);
        min = Math.min(map.getOrDefault('n',0) , min);
        min = Math.min(map.getOrDefault('l',0)/2 , min);
        min = Math.min(map.getOrDefault('o',0)/2 , min);

        return min;
    }
}