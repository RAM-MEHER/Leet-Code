class Solution 
{
    public String evaluate(String s, List<List<String>> knowledge) 
    {
        int sLen = s.length() , lLen = knowledge.size();
        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        //boolean flag = true;
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0 ; i < lLen ; i++)
            map.put(knowledge.get(i).get(0) , knowledge.get(i).get(1));
        
        for(int i = 0 ; i < sLen ; i++)
        {
            if(s.charAt(i) == '(')
            {
                int j = i+1;
                for(j = i+1 ; j < sLen ; j++)
                {
                    if(s.charAt(j) == ')')
                        break;
                    else
                        temp.append(s.charAt(j));
                }
                
                if(map.get(temp.toString()) == null)
                    ans.append("?");
                else
                    ans.append(map.get(temp.toString()));
                temp.setLength(0);
                i = j;
            }
            else
            {
                ans.append(s.charAt(i));
            }
            
        }
        return ans.toString();
    }
}