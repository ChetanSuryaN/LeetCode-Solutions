class Solution {
    public List<Integer> findSubstring(String s, String[] words) 
    {
        List<Integer> list=new ArrayList();      
        HashMap<String,Integer> map1=new HashMap<>();
        
        for(String word:words)
        {
            map1.put(word,map1.getOrDefault(word,0)+1);
        }
        int len=words[0].length();
        int window=words.length*len;
        if(s.length()<window)
        {
            return list;
        }
        
        for(int k=0;k<len;k++)
        {
            HashMap<String,Integer> map2=new HashMap<>();
            for(int i=k;i<window+k&&i+len<=s.length();i+=len)
            {
                String str=s.substring(i,i+len);
                map2.put(str,map2.getOrDefault(str,0)+1);
            }
            if(map1.equals(map2))
            {
                list.add(k);
            }
            int left=k;
            for(int i=window+k;i<=s.length()-len;i+=len)
            {
                String str=s.substring(left,left+len);
                map2.put(str,map2.getOrDefault(str,0)-1);
                if(map2.get(str)==0)
                {
                    map2.remove(str);
                }
                String st=s.substring(i,i+len);
                map2.put(st,map2.getOrDefault(st,0)+1);
                left+=len; 
                if(map1.equals(map2))
            {
                list.add(left);
            }   
                        
            }
        }
        return list;

        
    }
}