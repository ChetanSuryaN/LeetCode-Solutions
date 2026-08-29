class Solution {
    public String longestWord(String[] words) 
    {  
        HashSet<String> set=new HashSet<>();
        int len=-1;
        String ans="";
        for(String s:words)
        {
            set.add(s);
        }
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()>len&&hasAllSubstring(words[i],set))
            {
                ans=words[i];
                len=words[i].length();
            }
            else if(words[i].length()==len&&hasAllSubstring(words[i],set))
            {
                if(words[i].compareTo(ans)<0)
                {
                    ans=words[i];
                }
            }
        }
        return ans;     
    }
    public boolean hasAllSubstring(String s,HashSet<String> set)
    {
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.substring(0,i+1)))
            {
                return false;
            }
        }
        return true;
    }
}