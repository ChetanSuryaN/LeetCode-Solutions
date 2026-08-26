class Solution {
    public List<String> findRepeatedDnaSequences(String s) 
    {
        HashSet<String> set=new HashSet<>();
        List<String> list=new ArrayList<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String str=s.substring(i,i+10);
            if(set.contains(str))
            {
                list.add(str);
            }
            else
            {
            set.add(str);
            }
        }
        list=new ArrayList<>(new HashSet<>(list));

        

        return list;

    }
}