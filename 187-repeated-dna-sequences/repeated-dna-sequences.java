class Solution 
{
    public List<String> findRepeatedDnaSequences(String s) 
    {
        int i;
        HashMap<String , Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(i = 0 ; i <= s.length()-10 ; i++)
        {
            String sub = s.substring(i , i+10);
            map.put(sub , map.getOrDefault(sub , 0)+1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value > 1)
            {
                ans.add(key);
            }
        }
        return ans;
    }
}