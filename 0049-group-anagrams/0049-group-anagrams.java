class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> list=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            char chr[]=strs[i].toCharArray();
            Arrays.sort(chr);
            String s=new String(chr);
            if(map.containsKey(s))
            {
                list.remove(map.get(s));
                List<String>list1=map.get(s);
                list1.add(strs[i]);
                list.add(list1);
                map.put(s,list1);

            }
            else
            {
                List<String> list1= new ArrayList<>();
                list1.add(strs[i]);
                map.put(s,list1);
                list.add(list1);
            }
        }
        return list;

        
    }
}