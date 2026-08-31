class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        String []dup = new String[strs.length];
        for(int i = 0 ; i < strs.length ; i++)
        {
            dup[i] = strs[i];
        }
        List<List<String>> ans = new ArrayList<>();
        HashMap<String , ArrayList<String>> map = new HashMap<>();

        for(int i = 0 ; i < strs.length ; i++)
        {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            strs[i] = new String(arr);
        }

        for(int i = 0 ; i < strs.length ; i++)
        {
            ArrayList temp = map.getOrDefault(strs[i],new ArrayList<>());
            temp.add(dup[i]);
            map.put(strs[i] , temp);
        }
        for(Map.Entry<String , ArrayList<String>> entry : map.entrySet())
        {
            ans.add(entry.getValue());
        }
        return ans;
    }
}