class Solution {
    public String evaluate(String s, List<List<String>> knowledge) 
    {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> list:knowledge)
        {
            map.put(list.get(0),list.get(1));
        }
        StringBuilder sb=new StringBuilder();
        int j=0;
        while(j<s.length())
        {
            if(s.charAt(j)=='(')
            {
                StringBuilder key=new StringBuilder();
                j++;
                while(s.charAt(j)!=')')
                {
                    key.append(s.charAt(j));
                    j++;
                }
                String temp=new String(key);
               
                
               
                sb.append(map.getOrDefault(temp,"?"));
            }
            else
            {
                sb.append(s.charAt(j));
            }
             j++;
        }
        return new String(sb);
        
    }
}