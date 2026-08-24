class Solution {
    public String minWindow(String s, String t) 
    {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        int countMatches=0;
        int required=map1.size();
        int left=0;
        int len=Integer.MAX_VALUE;
        String ans="";
        for(int right=0;right<s.length();right++)
        {
            map2.put(s.charAt(right),map2.getOrDefault(s.charAt(right),0)+1);
            if(map2.get(s.charAt(right)).equals(map1.getOrDefault(s.charAt(right),0)))
            {
                countMatches++;
               
            }
            while(countMatches==required)
            {
                if(right-left+1<len)
                {
                    len=right-left+1;
                    ans=s.substring(left,right+1);
                }
                if(map1.get(s.charAt(left))!=null&&map1.get(s.charAt(left)).equals(map2.get(s.charAt(left))))
                {
                    countMatches--;
                }
                map2.put(s.charAt(left),map2.get(s.charAt(left))-1);
                left++;
            }


        
        }
        return ans;    
}
}